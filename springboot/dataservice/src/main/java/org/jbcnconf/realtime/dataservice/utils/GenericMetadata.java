package org.jbcnconf.realtime.dataservice.utils;

import org.jbcnconf.realtime.dataservice.model.Metadata;

public class GenericMetadata {

    public static Metadata getMetadata(String version, long initRequest, String urlRequest)
    {
        Metadata metadata = new Metadata();
        metadata.setApiVersion(version);
        metadata.setRequestTimestamp(RestRFIDDateFormat.format(initRequest));
        metadata.setResponseTimestamp(RestRFIDDateFormat.formatCurrent());
        metadata.setSelf(urlRequest);
        return metadata;
    }

    public static Metadata getMetadata(String version, long initRequest, String urlRequest, long items)
    {
        Metadata metadata = getMetadata(version, initRequest, urlRequest);
        metadata.setItemsTotal(Long.valueOf(items));
        return metadata;
    }
}
