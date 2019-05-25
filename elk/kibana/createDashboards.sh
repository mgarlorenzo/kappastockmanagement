#!/bin/bash
kibana_url=http://localhost:5601
###########################################################################################
curl -X POST \
  ''$kibana_url'/api/kibana/dashboards/import' \
  -H 'Content-Type: application/json' \
  -H 'kbn-xsrf: reporting' \
  -d '{
    "version": "7.0.0",
    "objects": [
        {
            "id": "8a84d460-345b-11e9-8005-5f29ac812ff5",
            "type": "dashboard",
            "updated_at": "2019-05-16T09:24:39.220Z",
            "version": "WzI3LDFd",
            "attributes": {
                "title": "Stock",
                "hits": 0,
                "description": "",
                "panelsJSON": "[{\"embeddableConfig\":{},\"gridData\":{\"x\":0,\"y\":6,\"w\":12,\"h\":6,\"i\":\"4\"},\"panelIndex\":\"4\",\"title\":\"Stock - Total Stock\",\"version\":\"6.5.3\",\"panelRefName\":\"panel_0\"},{\"embeddableConfig\":{},\"gridData\":{\"x\":0,\"y\":0,\"w\":12,\"h\":6,\"i\":\"6\"},\"panelIndex\":\"6\",\"title\":\"Stock - SKU/Store/Location\",\"version\":\"6.5.3\",\"panelRefName\":\"panel_1\"},{\"embeddableConfig\":{},\"gridData\":{\"x\":33,\"y\":0,\"w\":15,\"h\":11,\"i\":\"12\"},\"panelIndex\":\"12\",\"version\":\"6.6.0\",\"panelRefName\":\"panel_2\"},{\"embeddableConfig\":{},\"gridData\":{\"x\":0,\"y\":12,\"w\":12,\"h\":15,\"i\":\"16\"},\"panelIndex\":\"16\",\"version\":\"6.6.0\",\"panelRefName\":\"panel_3\"},{\"embeddableConfig\":{},\"gridData\":{\"x\":33,\"y\":11,\"w\":15,\"h\":16,\"i\":\"17\"},\"panelIndex\":\"17\",\"version\":\"6.6.0\",\"panelRefName\":\"panel_4\"},{\"embeddableConfig\":{\"mapCenter\":[25.799891182088334,14.23828125],\"mapZoom\":2},\"gridData\":{\"x\":12,\"y\":0,\"w\":21,\"h\":27,\"i\":\"19\"},\"panelIndex\":\"19\",\"title\":\"Stock - Map\",\"version\":\"7.0.0\",\"panelRefName\":\"panel_5\"}]",
                "optionsJSON": "{\"darkTheme\":true,\"hidePanelTitles\":false,\"useMargins\":true}",
                "version": 1,
                "timeRestore": true,
                "timeTo": "now/d",
                "timeFrom": "now/d",
                "refreshInterval": {
                    "pause": false,
                    "value": 5000
                },
                "kibanaSavedObjectMeta": {
                    "searchSourceJSON": "{\"query\":{\"language\":\"lucene\",\"query\":\"\"},\"filter\":[]}"
                }
            },
            "references": [
                {
                    "name": "panel_0",
                    "type": "visualization",
                    "id": "ed074b50-345a-11e9-8005-5f29ac812ff5"
                },
                {
                    "name": "panel_1",
                    "type": "visualization",
                    "id": "21368440-345b-11e9-8005-5f29ac812ff5"
                },
                {
                    "name": "panel_2",
                    "type": "visualization",
                    "id": "14a54550-351d-11e9-bd91-591bd6271949"
                },
                {
                    "name": "panel_3",
                    "type": "visualization",
                    "id": "f12c5820-4afc-11e9-bc06-030c9f17946f"
                },
                {
                    "name": "panel_4",
                    "type": "visualization",
                    "id": "edaf0790-345b-11e9-8005-5f29ac812ff5"
                },
                {
                    "name": "panel_5",
                    "type": "visualization",
                    "id": "2ccef140-7013-11e9-9426-232a868e3147"
                }
            ],
            "migrationVersion": {
                "dashboard": "7.0.0"
            }
        },
        {
            "id": "ed074b50-345a-11e9-8005-5f29ac812ff5",
            "type": "visualization",
            "updated_at": "2019-05-16T09:11:08.926Z",
            "version": "WzMsMV0=",
            "attributes": {
                "title": "Stock - Total Stock",
                "visState": "{\"title\":\"Stock - Total Stock\",\"type\":\"metric\",\"params\":{\"addTooltip\":true,\"addLegend\":false,\"type\":\"metric\",\"metric\":{\"percentageMode\":false,\"useRanges\":false,\"colorSchema\":\"Green to Red\",\"metricColorMode\":\"None\",\"colorsRange\":[{\"from\":0,\"to\":10000}],\"labels\":{\"show\":true},\"invertColors\":false,\"style\":{\"bgFill\":\"#000\",\"bgColor\":false,\"labelColor\":false,\"subText\":\"\",\"fontSize\":60}}},\"aggs\":[{\"id\":\"1\",\"enabled\":true,\"type\":\"sum\",\"schema\":\"metric\",\"params\":{\"field\":\"quantity\",\"customLabel\":\"Units\"}}]}",
                "uiStateJSON": "{}",
                "description": "",
                "version": 1,
                "kibanaSavedObjectMeta": {
                    "searchSourceJSON": "{\"query\":{\"query\":\"\",\"language\":\"lucene\"},\"filter\":[],\"indexRefName\":\"kibanaSavedObjectMeta.searchSourceJSON.index\"}"
                }
            },
            "references": [
                {
                    "name": "kibanaSavedObjectMeta.searchSourceJSON.index",
                    "type": "index-pattern",
                    "id": "cfd91970-40c4-11e9-85af-331b38d26e46"
                }
            ],
            "migrationVersion": {
                "visualization": "7.0.0"
            }
        },
        {
            "id": "21368440-345b-11e9-8005-5f29ac812ff5",
            "type": "visualization",
            "updated_at": "2019-05-16T09:11:08.926Z",
            "version": "WzQsMV0=",
            "attributes": {
                "title": "Stock - SKU/Store/Location",
                "visState": "{\"title\":\"Stock - SKU/Store/Location\",\"type\":\"metric\",\"params\":{\"addTooltip\":true,\"addLegend\":false,\"type\":\"metric\",\"metric\":{\"percentageMode\":false,\"useRanges\":false,\"colorSchema\":\"Green to Red\",\"metricColorMode\":\"None\",\"colorsRange\":[{\"from\":0,\"to\":10000}],\"labels\":{\"show\":true},\"invertColors\":false,\"style\":{\"bgFill\":\"#000\",\"bgColor\":false,\"labelColor\":false,\"subText\":\"\",\"fontSize\":60}}},\"aggs\":[{\"id\":\"1\",\"enabled\":true,\"type\":\"count\",\"schema\":\"metric\",\"params\":{\"customLabel\":\"Skus\"}}]}",
                "uiStateJSON": "{}",
                "description": "",
                "version": 1,
                "kibanaSavedObjectMeta": {
                    "searchSourceJSON": "{\"query\":{\"query\":\"\",\"language\":\"lucene\"},\"filter\":[],\"indexRefName\":\"kibanaSavedObjectMeta.searchSourceJSON.index\"}"
                }
            },
            "references": [
                {
                    "name": "kibanaSavedObjectMeta.searchSourceJSON.index",
                    "type": "index-pattern",
                    "id": "cfd91970-40c4-11e9-85af-331b38d26e46"
                }
            ],
            "migrationVersion": {
                "visualization": "7.0.0"
            }
        },
        {
            "id": "14a54550-351d-11e9-bd91-591bd6271949",
            "type": "visualization",
            "updated_at": "2019-05-16T09:11:08.926Z",
            "version": "WzUsMV0=",
            "attributes": {
                "title": "Stock - Locations",
                "visState": "{\"title\":\"Stock - Locations\",\"type\":\"pie\",\"params\":{\"type\":\"pie\",\"addTooltip\":true,\"addLegend\":true,\"legendPosition\":\"right\",\"isDonut\":true,\"labels\":{\"show\":true,\"values\":true,\"last_level\":true,\"truncate\":100}},\"aggs\":[{\"id\":\"1\",\"enabled\":true,\"type\":\"count\",\"schema\":\"metric\",\"params\":{}},{\"id\":\"2\",\"enabled\":true,\"type\":\"filters\",\"schema\":\"segment\",\"params\":{\"filters\":[{\"input\":{\"query\":\"rfidLocationId: \\\"1\\\"\"},\"label\":\"Store\"},{\"input\":{\"query\":\"rfidLocationId: \\\"2\\\"\"},\"label\":\"Warehouse\"}]}}]}",
                "uiStateJSON": "{}",
                "description": "",
                "version": 1,
                "kibanaSavedObjectMeta": {
                    "searchSourceJSON": "{\"query\":{\"query\":\"\",\"language\":\"lucene\"},\"filter\":[],\"indexRefName\":\"kibanaSavedObjectMeta.searchSourceJSON.index\"}"
                }
            },
            "references": [
                {
                    "name": "kibanaSavedObjectMeta.searchSourceJSON.index",
                    "type": "index-pattern",
                    "id": "cfd91970-40c4-11e9-85af-331b38d26e46"
                }
            ],
            "migrationVersion": {
                "visualization": "7.0.0"
            }
        },
        {
            "id": "f12c5820-4afc-11e9-bc06-030c9f17946f",
            "type": "visualization",
            "updated_at": "2019-05-16T09:11:08.926Z",
            "version": "WzYsMV0=",
            "attributes": {
                "title": "Stock - Top 10 SKU",
                "visState": "{\"title\":\"Stock - Top 10 SKU\",\"type\":\"table\",\"params\":{\"perPage\":10,\"showMetricsAtAllLevels\":false,\"showPartialRows\":false,\"showTotal\":false,\"sort\":{\"columnIndex\":null,\"direction\":null},\"totalFunc\":\"sum\"},\"aggs\":[{\"id\":\"1\",\"enabled\":true,\"type\":\"sum\",\"schema\":\"metric\",\"params\":{\"field\":\"quantity\",\"customLabel\":\"Total Quantity\"}},{\"id\":\"2\",\"enabled\":true,\"type\":\"terms\",\"schema\":\"bucket\",\"params\":{\"field\":\"sku\",\"size\":10,\"order\":\"desc\",\"orderBy\":\"1\",\"otherBucket\":false,\"otherBucketLabel\":\"Other\",\"missingBucket\":false,\"missingBucketLabel\":\"Missing\",\"customLabel\":\"SKU\"}}]}",
                "uiStateJSON": "{\"vis\":{\"params\":{\"sort\":{\"columnIndex\":1,\"direction\":null}}}}",
                "description": "",
                "version": 1,
                "kibanaSavedObjectMeta": {
                    "searchSourceJSON": "{\"query\":{\"query\":\"\",\"language\":\"kuery\"},\"filter\":[],\"indexRefName\":\"kibanaSavedObjectMeta.searchSourceJSON.index\"}"
                }
            },
            "references": [
                {
                    "name": "kibanaSavedObjectMeta.searchSourceJSON.index",
                    "type": "index-pattern",
                    "id": "cfd91970-40c4-11e9-85af-331b38d26e46"
                }
            ],
            "migrationVersion": {
                "visualization": "7.0.0"
            }
        },
        {
            "id": "edaf0790-345b-11e9-8005-5f29ac812ff5",
            "type": "visualization",
            "updated_at": "2019-05-16T09:22:21.339Z",
            "version": "WzI2LDFd",
            "attributes": {
                "title": "Stock - Top 10 Max Stock/Store",
                "visState": "{\"title\":\"Stock - Top 10 Max Stock/Store\",\"type\":\"table\",\"params\":{\"perPage\":10,\"showMetricsAtAllLevels\":false,\"showPartialRows\":false,\"showTotal\":false,\"sort\":{\"columnIndex\":null,\"direction\":null},\"totalFunc\":\"sum\"},\"aggs\":[{\"id\":\"1\",\"enabled\":true,\"type\":\"sum\",\"schema\":\"metric\",\"params\":{\"field\":\"quantity\",\"customLabel\":\"Stock\"}},{\"id\":\"3\",\"enabled\":true,\"type\":\"terms\",\"schema\":\"bucket\",\"params\":{\"field\":\"storeName\",\"size\":10,\"order\":\"desc\",\"orderBy\":\"1\",\"otherBucket\":false,\"otherBucketLabel\":\"Other\",\"missingBucket\":false,\"missingBucketLabel\":\"Missing\",\"customLabel\":\"Store Name\"}},{\"id\":\"2\",\"enabled\":true,\"type\":\"terms\",\"schema\":\"bucket\",\"params\":{\"field\":\"storeId\",\"size\":10,\"order\":\"desc\",\"orderBy\":\"1\",\"otherBucket\":false,\"otherBucketLabel\":\"Other\",\"missingBucket\":false,\"missingBucketLabel\":\"Missing\",\"customLabel\":\"Store Id\"}}]}",
                "uiStateJSON": "{\"vis\":{\"params\":{\"sort\":{\"columnIndex\":null,\"direction\":null}}}}",
                "description": "",
                "version": 1,
                "kibanaSavedObjectMeta": {
                    "searchSourceJSON": "{\"query\":{\"language\":\"lucene\",\"query\":\"\"},\"filter\":[],\"indexRefName\":\"kibanaSavedObjectMeta.searchSourceJSON.index\"}"
                }
            },
            "references": [
                {
                    "name": "kibanaSavedObjectMeta.searchSourceJSON.index",
                    "type": "index-pattern",
                    "id": "cfd91970-40c4-11e9-85af-331b38d26e46"
                }
            ],
            "migrationVersion": {
                "visualization": "7.0.0"
            }
        },
        {
            "id": "2ccef140-7013-11e9-9426-232a868e3147",
            "type": "visualization",
            "updated_at": "2019-05-16T09:21:19.353Z",
            "version": "WzI1LDFd",
            "attributes": {
                "title": "Stock Map",
                "visState": "{\"title\":\"Stock Map\",\"type\":\"tile_map\",\"params\":{\"colorSchema\":\"Yellow to Red\",\"mapType\":\"Scaled Circle Markers\",\"isDesaturated\":true,\"addTooltip\":true,\"heatClusterSize\":1.3,\"legendPosition\":\"bottomright\",\"mapZoom\":2,\"mapCenter\":[0,0],\"wms\":{\"enabled\":false,\"options\":{\"format\":\"image/png\",\"transparent\":true},\"selectedTmsLayer\":{\"origin\":\"elastic_maps_service\",\"id\":\"road_map\",\"minZoom\":0,\"maxZoom\":18,\"attribution\":\"<p>&#169; <a href=\\\"https://www.openstreetmap.org/copyright\\\">OpenStreetMap contributors</a>|<a href=\\\"https://openmaptiles.org\\\">OpenMapTiles</a>|<a href=\\\"https://www.maptiler.com\\\">MapTiler</a>|<a href=\\\"https://www.elastic.co/elastic-maps-service\\\">Elastic Maps Service</a></p>&#10;\"}}},\"aggs\":[{\"id\":\"1\",\"enabled\":true,\"type\":\"sum\",\"schema\":\"metric\",\"params\":{\"field\":\"quantity\",\"customLabel\":\"Total Stock\"}},{\"id\":\"2\",\"enabled\":true,\"type\":\"geohash_grid\",\"schema\":\"segment\",\"params\":{\"field\":\"location\",\"autoPrecision\":true,\"isFilteredByCollar\":true,\"useGeocentroid\":true,\"mapZoom\":3,\"mapCenter\":{\"lon\":18.984375000000004,\"lat\":9.015302333420598},\"mapBounds\":{\"bottom_right\":{\"lat\":-49.724479188712984,\"lon\":149.23828125000003},\"top_left\":{\"lat\":60.06484046010452,\"lon\":-111.26953125000003}},\"precision\":2,\"customLabel\":\"GPS Location\"}}]}",
                "uiStateJSON": "{\"mapZoom\":3,\"mapCenter\":[9.053335504825453,19.031122466549277]}",
                "description": "",
                "version": 1,
                "kibanaSavedObjectMeta": {
                    "searchSourceJSON": "{\"query\":{\"query\":\"\",\"language\":\"kuery\"},\"filter\":[],\"indexRefName\":\"kibanaSavedObjectMeta.searchSourceJSON.index\"}"
                }
            },
            "references": [
                {
                    "name": "kibanaSavedObjectMeta.searchSourceJSON.index",
                    "type": "index-pattern",
                    "id": "cfd91970-40c4-11e9-85af-331b38d26e46"
                }
            ],
            "migrationVersion": {
                "visualization": "7.0.0"
            }
        },
        {
            "id": "cfd91970-40c4-11e9-85af-331b38d26e46",
            "type": "index-pattern",
            "updated_at": "2019-05-16T10:12:39.739Z",
            "version": "WzI5LDFd",
            "attributes": {
                "title": "stock-*",
                "timeFieldName": "@timestamp",
                "fields": "[{\"name\":\"@timestamp\",\"type\":\"date\",\"count\":0,\"scripted\":false,\"searchable\":true,\"aggregatable\":true,\"readFromDocValues\":true},{\"name\":\"@version\",\"type\":\"string\",\"count\":0,\"scripted\":false,\"searchable\":true,\"aggregatable\":false,\"readFromDocValues\":false},{\"name\":\"@version.keyword\",\"type\":\"string\",\"count\":0,\"scripted\":false,\"searchable\":true,\"aggregatable\":true,\"readFromDocValues\":true},{\"name\":\"_id\",\"type\":\"string\",\"count\":0,\"scripted\":false,\"searchable\":true,\"aggregatable\":true,\"readFromDocValues\":false},{\"name\":\"_index\",\"type\":\"string\",\"count\":0,\"scripted\":false,\"searchable\":true,\"aggregatable\":true,\"readFromDocValues\":false},{\"name\":\"_score\",\"type\":\"number\",\"count\":0,\"scripted\":false,\"searchable\":false,\"aggregatable\":false,\"readFromDocValues\":false},{\"name\":\"_source\",\"type\":\"_source\",\"count\":0,\"scripted\":false,\"searchable\":false,\"aggregatable\":false,\"readFromDocValues\":false},{\"name\":\"_type\",\"type\":\"string\",\"count\":0,\"scripted\":false,\"searchable\":true,\"aggregatable\":true,\"readFromDocValues\":false},{\"name\":\"id\",\"type\":\"number\",\"count\":0,\"scripted\":false,\"searchable\":true,\"aggregatable\":true,\"readFromDocValues\":true},{\"name\":\"location\",\"type\":\"geo_point\",\"count\":0,\"scripted\":false,\"searchable\":true,\"aggregatable\":true,\"readFromDocValues\":true},{\"name\":\"quantity\",\"type\":\"number\",\"count\":0,\"scripted\":false,\"searchable\":true,\"aggregatable\":true,\"readFromDocValues\":true},{\"name\":\"rfidLocationId\",\"type\":\"string\",\"count\":0,\"scripted\":false,\"searchable\":true,\"aggregatable\":true,\"readFromDocValues\":true},{\"name\":\"sku\",\"type\":\"number\",\"count\":0,\"scripted\":false,\"searchable\":true,\"aggregatable\":true,\"readFromDocValues\":true},{\"name\":\"storeId\",\"type\":\"string\",\"count\":0,\"scripted\":false,\"searchable\":true,\"aggregatable\":true,\"readFromDocValues\":true},{\"name\":\"storeName\",\"type\":\"string\",\"count\":0,\"scripted\":false,\"searchable\":true,\"aggregatable\":true,\"readFromDocValues\":true}]",
                "fieldFormatMap": "{\"sku\":{\"id\":\"number\",\"params\":{\"pattern\":\"0\"}},\"id\":{\"id\":\"number\",\"params\":{\"pattern\":\"0\"}}}"
            },
            "references": [],
            "migrationVersion": {
                "index-pattern": "6.5.0"
            }
        }
    ]
}'
curl -X POST \
  ''$kibana_url'/api/kibana/dashboards/import' \
  -H 'Content-Type: application/json' \
  -H 'kbn-xsrf: reporting' \
  -d '{
    "version": "7.0.0",
    "objects": [
        {
            "id": "1ce49980-334e-11e9-85af-331b38d26e46",
            "type": "dashboard",
            "updated_at": "2019-05-07T14:08:52.192Z",
            "version": "Wzc0LDFd",
            "attributes": {
                "title": "Movements",
                "hits": 0,
                "description": "",
                "panelsJSON": "[{\"embeddableConfig\":{},\"gridData\":{\"x\":0,\"y\":0,\"w\":14,\"h\":6,\"i\":\"1\"},\"panelIndex\":\"1\",\"title\":\"TPS  @ Movements\",\"version\":\"6.6.0\",\"panelRefName\":\"panel_0\"},{\"embeddableConfig\":{},\"gridData\":{\"x\":0,\"y\":6,\"w\":7,\"h\":7,\"i\":\"3\"},\"panelIndex\":\"3\",\"title\":\"TPS @ Warehouse Movements\",\"version\":\"6.6.0\",\"panelRefName\":\"panel_1\"},{\"embeddableConfig\":{\"vis\":{\"legendOpen\":false}},\"gridData\":{\"x\":14,\"y\":0,\"w\":13,\"h\":13,\"i\":\"4\"},\"panelIndex\":\"4\",\"title\":\"Distribution @ Location Movements\",\"version\":\"6.6.0\",\"panelRefName\":\"panel_2\"},{\"embeddableConfig\":{},\"gridData\":{\"x\":7,\"y\":6,\"w\":7,\"h\":7,\"i\":\"5\"},\"panelIndex\":\"5\",\"title\":\"TPS @ Store Movements\",\"version\":\"6.6.0\",\"panelRefName\":\"panel_3\"},{\"embeddableConfig\":{\"vis\":{\"legendOpen\":false}},\"gridData\":{\"x\":27,\"y\":0,\"w\":21,\"h\":13,\"i\":\"6\"},\"panelIndex\":\"6\",\"title\":\"Top 10 @ SKU\",\"version\":\"6.6.0\",\"panelRefName\":\"panel_4\"},{\"embeddableConfig\":{},\"gridData\":{\"x\":27,\"y\":13,\"w\":21,\"h\":14,\"i\":\"7\"},\"panelIndex\":\"7\",\"title\":\"Top 10 @ Stores\",\"version\":\"6.6.0\",\"panelRefName\":\"panel_5\"},{\"embeddableConfig\":{},\"gridData\":{\"x\":0,\"y\":13,\"w\":27,\"h\":14,\"i\":\"8\"},\"panelIndex\":\"8\",\"version\":\"7.0.0\",\"title\":\"Table @ Movements\",\"panelRefName\":\"panel_6\"}]",
                "optionsJSON": "{\"darkTheme\":true,\"hidePanelTitles\":false,\"useMargins\":true}",
                "version": 1,
                "timeRestore": false,
                "kibanaSavedObjectMeta": {
                    "searchSourceJSON": "{\"query\":{\"language\":\"lucene\",\"query\":\"\"},\"filter\":[]}"
                }
            },
            "references": [
                {
                    "name": "panel_0",
                    "type": "visualization",
                    "id": "2cb79d40-334d-11e9-85af-331b38d26e46"
                },
                {
                    "name": "panel_1",
                    "type": "visualization",
                    "id": "e4e67e40-334d-11e9-85af-331b38d26e46"
                },
                {
                    "name": "panel_2",
                    "type": "visualization",
                    "id": "aec65550-334e-11e9-85af-331b38d26e46"
                },
                {
                    "name": "panel_3",
                    "type": "visualization",
                    "id": "378e6570-3350-11e9-85af-331b38d26e46"
                },
                {
                    "name": "panel_4",
                    "type": "visualization",
                    "id": "c4919c80-3378-11e9-85af-331b38d26e46"
                },
                {
                    "name": "panel_5",
                    "type": "visualization",
                    "id": "62f259a0-3379-11e9-85af-331b38d26e46"
                },
                {
                    "name": "panel_6",
                    "type": "visualization",
                    "id": "48819b40-70d1-11e9-8a88-0be8bf2f1634"
                }
            ],
            "migrationVersion": {
                "dashboard": "7.0.0"
            }
        },
        {
            "id": "2cb79d40-334d-11e9-85af-331b38d26e46",
            "type": "visualization",
            "updated_at": "2019-05-07T13:55:58.845Z",
            "version": "WzQ2LDFd",
            "attributes": {
                "title": "TPS  @ Movimientos",
                "visState": "{\"title\":\"TPS  @ Movimientos\",\"type\":\"metric\",\"params\":{\"addTooltip\":true,\"addLegend\":false,\"type\":\"metric\",\"metric\":{\"percentageMode\":false,\"useRanges\":false,\"colorSchema\":\"Green to Red\",\"metricColorMode\":\"None\",\"colorsRange\":[{\"from\":0,\"to\":10000}],\"labels\":{\"show\":false},\"invertColors\":false,\"style\":{\"bgFill\":\"#000\",\"bgColor\":false,\"labelColor\":false,\"subText\":\"\",\"fontSize\":60}}},\"aggs\":[{\"id\":\"1\",\"enabled\":true,\"type\":\"count\",\"schema\":\"metric\",\"params\":{}}]}",
                "uiStateJSON": "{}",
                "description": "",
                "version": 1,
                "kibanaSavedObjectMeta": {
                    "searchSourceJSON": "{\"query\":{\"query\":\"\",\"language\":\"lucene\"},\"filter\":[],\"indexRefName\":\"kibanaSavedObjectMeta.searchSourceJSON.index\"}"
                }
            },
            "references": [
                {
                    "name": "kibanaSavedObjectMeta.searchSourceJSON.index",
                    "type": "index-pattern",
                    "id": "b54f3340-30f8-11e9-85af-331b38d26e46"
                }
            ],
            "migrationVersion": {
                "visualization": "7.0.0"
            }
        },
        {
            "id": "e4e67e40-334d-11e9-85af-331b38d26e46",
            "type": "visualization",
            "updated_at": "2019-05-07T13:55:58.845Z",
            "version": "WzQ4LDFd",
            "attributes": {
                "title": "TPS @ Movimientos a Almacen",
                "visState": "{\"title\":\"TPS @ Movimientos a Almacen\",\"type\":\"metric\",\"params\":{\"addTooltip\":true,\"addLegend\":false,\"type\":\"metric\",\"metric\":{\"percentageMode\":false,\"useRanges\":false,\"colorSchema\":\"Green to Red\",\"metricColorMode\":\"None\",\"colorsRange\":[{\"from\":0,\"to\":10000}],\"labels\":{\"show\":false},\"invertColors\":false,\"style\":{\"bgFill\":\"#000\",\"bgColor\":false,\"labelColor\":false,\"subText\":\"\",\"fontSize\":60}}},\"aggs\":[{\"id\":\"1\",\"enabled\":true,\"type\":\"count\",\"schema\":\"metric\",\"params\":{}}]}",
                "uiStateJSON": "{}",
                "description": "",
                "version": 1,
                "kibanaSavedObjectMeta": {
                    "searchSourceJSON": "{\"query\":{\"query\":\"\",\"language\":\"lucene\"},\"filter\":[{\"meta\":{\"type\":\"phrases\",\"key\":\"to\",\"value\":\"22, 1\",\"params\":[\"22\",\"1\"],\"negate\":false,\"disabled\":false,\"alias\":null,\"indexRefName\":\"kibanaSavedObjectMeta.searchSourceJSON.filter[0].meta.index\"},\"query\":{\"bool\":{\"should\":[{\"match_phrase\":{\"to\":\"22\"}},{\"match_phrase\":{\"to\":\"1\"}}],\"minimum_should_match\":1}},\"$state\":{\"storeId\":\"appState\"}}],\"indexRefName\":\"kibanaSavedObjectMeta.searchSourceJSON.index\"}"
                }
            },
            "references": [
                {
                    "name": "kibanaSavedObjectMeta.searchSourceJSON.index",
                    "type": "index-pattern",
                    "id": "b54f3340-30f8-11e9-85af-331b38d26e46"
                },
                {
                    "name": "kibanaSavedObjectMeta.searchSourceJSON.filter[0].meta.index",
                    "type": "index-pattern",
                    "id": "b54f3340-30f8-11e9-85af-331b38d26e46"
                }
            ],
            "migrationVersion": {
                "visualization": "7.0.0"
            }
        },
        {
            "id": "aec65550-334e-11e9-85af-331b38d26e46",
            "type": "visualization",
            "updated_at": "2019-05-07T13:55:58.845Z",
            "version": "WzQ5LDFd",
            "attributes": {
                "title": "Distribucion @ Movimientos por ubicacion",
                "visState": "{\"title\":\"Distribuci\ufffdn @ Movimientos por ubicacion\",\"type\":\"pie\",\"params\":{\"type\":\"pie\",\"addTooltip\":true,\"addLegend\":true,\"legendPosition\":\"right\",\"isDonut\":false,\"labels\":{\"show\":true,\"values\":true,\"last_level\":true,\"truncate\":100}},\"aggs\":[{\"id\":\"1\",\"enabled\":true,\"type\":\"count\",\"schema\":\"metric\",\"params\":{}},{\"id\":\"2\",\"enabled\":true,\"type\":\"filters\",\"schema\":\"segment\",\"params\":{\"filters\":[{\"input\":{\"query\":\"to:\\\"2\\\"\"},\"label\":\"Store\"},{\"input\":{\"query\":\"to:\\\"1\\\"\"},\"label\":\"Warehouse\"}]}}]}",
                "uiStateJSON": "{}",
                "description": "",
                "version": 1,
                "kibanaSavedObjectMeta": {
                    "searchSourceJSON": "{\"query\":{\"query\":\"\",\"language\":\"lucene\"},\"filter\":[],\"indexRefName\":\"kibanaSavedObjectMeta.searchSourceJSON.index\"}"
                }
            },
            "references": [
                {
                    "name": "kibanaSavedObjectMeta.searchSourceJSON.index",
                    "type": "index-pattern",
                    "id": "b54f3340-30f8-11e9-85af-331b38d26e46"
                }
            ],
            "migrationVersion": {
                "visualization": "7.0.0"
            }
        },
        {
            "id": "378e6570-3350-11e9-85af-331b38d26e46",
            "type": "visualization",
            "updated_at": "2019-05-07T13:55:58.845Z",
            "version": "WzUwLDFd",
            "attributes": {
                "title": "TPS @ Movimientos a Tienda",
                "visState": "{\"title\":\"TPS @ Movimientos a Tienda\",\"type\":\"metric\",\"params\":{\"addTooltip\":true,\"addLegend\":false,\"type\":\"metric\",\"metric\":{\"percentageMode\":false,\"useRanges\":false,\"colorSchema\":\"Green to Red\",\"metricColorMode\":\"None\",\"colorsRange\":[{\"from\":0,\"to\":10000}],\"labels\":{\"show\":false},\"invertColors\":false,\"style\":{\"bgFill\":\"#000\",\"bgColor\":false,\"labelColor\":false,\"subText\":\"\",\"fontSize\":60}}},\"aggs\":[{\"id\":\"1\",\"enabled\":true,\"type\":\"count\",\"schema\":\"metric\",\"params\":{}}]}",
                "uiStateJSON": "{}",
                "description": "",
                "version": 1,
                "kibanaSavedObjectMeta": {
                    "searchSourceJSON": "{\"query\":{\"query\":\"\",\"language\":\"lucene\"},\"filter\":[{\"meta\":{\"negate\":false,\"disabled\":false,\"alias\":null,\"type\":\"phrase\",\"key\":\"to\",\"value\":\"2\",\"params\":{\"query\":\"2\",\"type\":\"phrase\"},\"indexRefName\":\"kibanaSavedObjectMeta.searchSourceJSON.filter[0].meta.index\"},\"query\":{\"match\":{\"to\":{\"query\":\"2\",\"type\":\"phrase\"}}},\"$state\":{\"storeId\":\"appState\"}}],\"indexRefName\":\"kibanaSavedObjectMeta.searchSourceJSON.index\"}"
                }
            },
            "references": [
                {
                    "name": "kibanaSavedObjectMeta.searchSourceJSON.index",
                    "type": "index-pattern",
                    "id": "b54f3340-30f8-11e9-85af-331b38d26e46"
                },
                {
                    "name": "kibanaSavedObjectMeta.searchSourceJSON.filter[0].meta.index",
                    "type": "index-pattern",
                    "id": "b54f3340-30f8-11e9-85af-331b38d26e46"
                }
            ],
            "migrationVersion": {
                "visualization": "7.0.0"
            }
        },
        {
            "id": "c4919c80-3378-11e9-85af-331b38d26e46",
            "type": "visualization",
            "updated_at": "2019-05-07T13:55:58.845Z",
            "version": "WzUxLDFd",
            "attributes": {
                "title": "Top 10 @ PMCCT",
                "visState": "{\"title\":\"Top 10 @ PMCCT\",\"type\":\"histogram\",\"params\":{\"type\":\"histogram\",\"grid\":{\"categoryLines\":false,\"style\":{\"color\":\"#eee\"}},\"categoryAxes\":[{\"id\":\"CategoryAxis-1\",\"type\":\"category\",\"position\":\"bottom\",\"show\":true,\"style\":{},\"scale\":{\"type\":\"linear\"},\"labels\":{\"show\":true,\"truncate\":100},\"title\":{}}],\"valueAxes\":[{\"id\":\"ValueAxis-1\",\"name\":\"LeftAxis-1\",\"type\":\"value\",\"position\":\"left\",\"show\":true,\"style\":{},\"scale\":{\"type\":\"linear\",\"mode\":\"normal\"},\"labels\":{\"show\":true,\"rotate\":0,\"filter\":false,\"truncate\":100},\"title\":{\"text\":\"Total Items\"}}],\"seriesParams\":[{\"show\":true,\"mode\":\"stacked\",\"type\":\"histogram\",\"drawLinesBetweenPoints\":true,\"showCircles\":true,\"data\":{\"id\":\"2\",\"label\":\"Total Items\"},\"valueAxis\":\"ValueAxis-1\"}],\"addTooltip\":false,\"addLegend\":true,\"legendPosition\":\"right\",\"times\":[],\"addTimeMarker\":false,\"orderBucketsBySum\":true},\"aggs\":[{\"id\":\"2\",\"enabled\":true,\"type\":\"count\",\"schema\":\"metric\",\"params\":{\"customLabel\":\"Total Items\"}},{\"id\":\"3\",\"enabled\":true,\"type\":\"terms\",\"schema\":\"segment\",\"params\":{\"field\":\"sku\",\"size\":10,\"order\":\"desc\",\"orderBy\":\"2\",\"otherBucket\":false,\"otherBucketLabel\":\"Other\",\"missingBucket\":false,\"missingBucketLabel\":\"Missing\",\"customLabel\":\"sku\"}}]}",
                "uiStateJSON": "{\"vis\":{\"legendOpen\":false}}",
                "description": "",
                "version": 1,
                "kibanaSavedObjectMeta": {
                    "searchSourceJSON": "{\"query\":{\"language\":\"lucene\",\"query\":\"\"},\"filter\":[],\"indexRefName\":\"kibanaSavedObjectMeta.searchSourceJSON.index\"}"
                }
            },
            "references": [
                {
                    "name": "kibanaSavedObjectMeta.searchSourceJSON.index",
                    "type": "index-pattern",
                    "id": "b54f3340-30f8-11e9-85af-331b38d26e46"
                }
            ],
            "migrationVersion": {
                "visualization": "7.0.0"
            }
        },
        {
            "id": "62f259a0-3379-11e9-85af-331b38d26e46",
            "type": "visualization",
            "updated_at": "2019-05-07T13:55:58.845Z",
            "version": "WzUyLDFd",
            "attributes": {
                "title": "Top 10 @ Tiendas",
                "visState": "{\"title\":\"Top 10 @ Tiendas\",\"type\":\"histogram\",\"params\":{\"type\":\"histogram\",\"grid\":{\"categoryLines\":false,\"style\":{\"color\":\"#eee\"}},\"categoryAxes\":[{\"id\":\"CategoryAxis-1\",\"type\":\"category\",\"position\":\"bottom\",\"show\":true,\"style\":{},\"scale\":{\"type\":\"linear\"},\"labels\":{\"show\":true,\"truncate\":100},\"title\":{}}],\"valueAxes\":[{\"id\":\"ValueAxis-1\",\"name\":\"LeftAxis-1\",\"type\":\"value\",\"position\":\"left\",\"show\":true,\"style\":{},\"scale\":{\"type\":\"linear\",\"mode\":\"normal\"},\"labels\":{\"show\":true,\"rotate\":0,\"filter\":false,\"truncate\":100},\"title\":{\"text\":\"Total Items\"}}],\"seriesParams\":[{\"show\":true,\"mode\":\"stacked\",\"type\":\"histogram\",\"drawLinesBetweenPoints\":true,\"showCircles\":true,\"data\":{\"id\":\"2\",\"label\":\"Total Items\"},\"valueAxis\":\"ValueAxis-1\"}],\"addTooltip\":false,\"addLegend\":true,\"legendPosition\":\"right\",\"times\":[],\"addTimeMarker\":false,\"orderBucketsBySum\":true},\"aggs\":[{\"id\":\"2\",\"enabled\":true,\"type\":\"count\",\"schema\":\"metric\",\"params\":{\"customLabel\":\"Total Items\"}},{\"id\":\"3\",\"enabled\":true,\"type\":\"terms\",\"schema\":\"segment\",\"params\":{\"field\":\"storeId\",\"size\":10,\"order\":\"desc\",\"orderBy\":\"2\",\"otherBucket\":false,\"otherBucketLabel\":\"Other\",\"missingBucket\":false,\"missingBucketLabel\":\"Missing\",\"customLabel\":\"Stores\"}}]}",
                "uiStateJSON": "{\"vis\":{\"legendOpen\":false}}",
                "description": "",
                "version": 1,
                "kibanaSavedObjectMeta": {
                    "searchSourceJSON": "{\"query\":{\"language\":\"lucene\",\"query\":\"\"},\"filter\":[],\"indexRefName\":\"kibanaSavedObjectMeta.searchSourceJSON.index\"}"
                }
            },
            "references": [
                {
                    "name": "kibanaSavedObjectMeta.searchSourceJSON.index",
                    "type": "index-pattern",
                    "id": "b54f3340-30f8-11e9-85af-331b38d26e46"
                }
            ],
            "migrationVersion": {
                "visualization": "7.0.0"
            }
        },
        {
            "id": "48819b40-70d1-11e9-8a88-0be8bf2f1634",
            "type": "visualization",
            "updated_at": "2019-05-07T14:08:07.321Z",
            "version": "WzcyLDFd",
            "attributes": {
                "title": "Movements Table",
                "visState": "{\"title\":\"Movements Table\",\"type\":\"table\",\"params\":{\"perPage\":8,\"showPartialRows\":false,\"showMetricsAtAllLevels\":false,\"sort\":{\"columnIndex\":null,\"direction\":null},\"showTotal\":false,\"totalFunc\":\"sum\"},\"aggs\":[{\"id\":\"1\",\"enabled\":true,\"type\":\"count\",\"schema\":\"metric\",\"params\":{}},{\"id\":\"2\",\"enabled\":true,\"type\":\"terms\",\"schema\":\"bucket\",\"params\":{\"field\":\"storeId\",\"size\":5,\"order\":\"desc\",\"orderBy\":\"1\",\"otherBucket\":false,\"otherBucketLabel\":\"Other\",\"missingBucket\":false,\"missingBucketLabel\":\"Missing\",\"customLabel\":\"store\"}},{\"id\":\"3\",\"enabled\":true,\"type\":\"terms\",\"schema\":\"bucket\",\"params\":{\"field\":\"sku\",\"size\":10,\"order\":\"desc\",\"orderBy\":\"1\",\"otherBucket\":false,\"otherBucketLabel\":\"Other\",\"missingBucket\":false,\"missingBucketLabel\":\"Missing\",\"customLabel\":\"sku\"}},{\"id\":\"4\",\"enabled\":true,\"type\":\"terms\",\"schema\":\"bucket\",\"params\":{\"field\":\"from\",\"size\":10,\"order\":\"desc\",\"orderBy\":\"1\",\"otherBucket\":false,\"otherBucketLabel\":\"Other\",\"missingBucket\":true,\"missingBucketLabel\":\"-\",\"customLabel\":\"from\"}},{\"id\":\"5\",\"enabled\":true,\"type\":\"terms\",\"schema\":\"bucket\",\"params\":{\"field\":\"to\",\"size\":10,\"order\":\"desc\",\"orderBy\":\"1\",\"otherBucket\":false,\"otherBucketLabel\":\"Other\",\"missingBucket\":true,\"missingBucketLabel\":\"-\",\"customLabel\":\"to\"}}]}",
                "uiStateJSON": "{\"vis\":{\"params\":{\"sort\":{\"columnIndex\":0,\"direction\":\"asc\"}}}}",
                "description": "",
                "version": 1,
                "kibanaSavedObjectMeta": {
                    "searchSourceJSON": "{\"query\":{\"query\":\"\",\"language\":\"kuery\"},\"filter\":[],\"indexRefName\":\"kibanaSavedObjectMeta.searchSourceJSON.index\"}"
                }
            },
            "references": [
                {
                    "name": "kibanaSavedObjectMeta.searchSourceJSON.index",
                    "type": "index-pattern",
                    "id": "b54f3340-30f8-11e9-85af-331b38d26e46"
                }
            ],
            "migrationVersion": {
                "visualization": "7.0.0"
            }
        },
        {
            "id": "b54f3340-30f8-11e9-85af-331b38d26e46",
            "type": "index-pattern",
            "updated_at": "2019-05-07T13:57:43.676Z",
            "version": "WzY0LDFd",
            "attributes": {
                "title": "changes-*",
                "timeFieldName": "@timestamp",
                "fields": "[{\"name\":\"@timestamp\",\"type\":\"date\",\"count\":0,\"scripted\":false,\"searchable\":true,\"aggregatable\":true,\"readFromDocValues\":true},{\"name\":\"@version\",\"type\":\"string\",\"count\":0,\"scripted\":false,\"searchable\":true,\"aggregatable\":false,\"readFromDocValues\":false},{\"name\":\"@version.keyword\",\"type\":\"string\",\"count\":0,\"scripted\":false,\"searchable\":true,\"aggregatable\":true,\"readFromDocValues\":true},{\"name\":\"_id\",\"type\":\"string\",\"count\":0,\"scripted\":false,\"searchable\":true,\"aggregatable\":true,\"readFromDocValues\":false},{\"name\":\"_index\",\"type\":\"string\",\"count\":0,\"scripted\":false,\"searchable\":true,\"aggregatable\":true,\"readFromDocValues\":false},{\"name\":\"_score\",\"type\":\"number\",\"count\":0,\"scripted\":false,\"searchable\":false,\"aggregatable\":false,\"readFromDocValues\":false},{\"name\":\"_source\",\"type\":\"_source\",\"count\":0,\"scripted\":false,\"searchable\":false,\"aggregatable\":false,\"readFromDocValues\":false},{\"name\":\"_type\",\"type\":\"string\",\"count\":0,\"scripted\":false,\"searchable\":true,\"aggregatable\":true,\"readFromDocValues\":false},{\"name\":\"from\",\"type\":\"string\",\"count\":0,\"scripted\":false,\"searchable\":true,\"aggregatable\":true,\"readFromDocValues\":true},{\"name\":\"id\",\"type\":\"number\",\"count\":0,\"scripted\":false,\"searchable\":true,\"aggregatable\":true,\"readFromDocValues\":true},{\"name\":\"sku\",\"type\":\"number\",\"count\":0,\"scripted\":false,\"searchable\":true,\"aggregatable\":true,\"readFromDocValues\":true},{\"name\":\"storeId\",\"type\":\"string\",\"count\":0,\"scripted\":false,\"searchable\":true,\"aggregatable\":true,\"readFromDocValues\":true},{\"name\":\"to\",\"type\":\"string\",\"count\":0,\"scripted\":false,\"searchable\":true,\"aggregatable\":true,\"readFromDocValues\":true}]",
                "fieldFormatMap": "{\"serialNumber\":{\"id\":\"number\",\"params\":{\"pattern\":\"0\"}},\"sku\":{\"id\":\"number\",\"params\":{\"pattern\":\"0\"}},\"id\":{\"id\":\"number\",\"params\":{\"pattern\":\"0\"}}}"
            },
            "references": [],
            "migrationVersion": {
                "index-pattern": "6.5.0"
            }
        }
    ]
}'