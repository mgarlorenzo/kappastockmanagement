package org.jbcnconf.realtime.common.datagrid.processor;


import com.tangosol.io.pof.PofReader;
import com.tangosol.io.pof.PofWriter;
import com.tangosol.io.pof.PortableObject;
import com.tangosol.util.InvocableMap;
import com.tangosol.util.processor.AbstractProcessor;
import org.jbcnconf.realtime.common.model.datagrid.StockValue;


import java.io.IOException;
import java.util.Map;
import java.util.Set;

/**
 * Implementing of cache concurrency to add product stock to a location
 *
 * @author Miguel Garcia
 */
public class AddStockEntryProcessor  extends AbstractProcessor implements PortableObject {

    private int  storeId;

    public AddStockEntryProcessor() {}

    public AddStockEntryProcessor(int storeId) {}


    /**
     * @param entry
     * @return
     */
    public Object process(InvocableMap.Entry entry){
        StockValue value = (StockValue) entry.getValue();
        value.addStock();
        entry.setValue(value);
        return null;
    }

    /**
     * @param entrySet
     * @return
     */
    public Map processAll(Set entrySet){
        return null;
    }

    /**
     * @param pofReader
     * @throws IOException
     */
    public void readExternal(PofReader pofReader) throws IOException {
        storeId = pofReader.readInt(0);

    }

    /**
     * @param pofWriter
     * @throws IOException
     */
    public void writeExternal(PofWriter pofWriter) throws IOException {
        pofWriter.writeInt(0,storeId);
    }
}
