#!/bin/bash
elastic_url=http://localhost:9200
###########################################################################################
curl -X PUT \
  ''$elastic_url'/_template/stock' \
  -H 'Content-Type: application/json' \
  -d '{
	"index_patterns": [
		"stock-*"
	],
	"settings": {
		"index": {
			"number_of_shards": 1
		}
	},
	"mappings": {
		"properties": {
			"id": {
				"type": "long",
				"store": true
			},
			"sku": {
				"type": "long",
				"store": true
			},
			"storeId": {
				"type": "keyword",
				"store": true
			},
			"storeName": {
				"type": "keyword",
				"store": true
			},
			"quantity": {
				"type": "short",
				"store": true
			},
			"rfidLocationId": {
				"type": "keyword",
				"store": true
			},
			"location": {
				"type": "geo_point",
				"store": true
			}
		}
	}
}' 
curl -X PUT \
  ''$elastic_url'/_template/changes' \
  -H 'Content-Type: application/json' \
  -d '{
		"index_patterns": [
			"changes-*"
		],
		"settings": {
			"index": {
				"number_of_shards": "1"
			}
		},
		"mappings": {
			"properties": {
				"id": {
					"type": "long",
					"store": true
				},
				"storeId": {
					"type": "keyword",
					"store": true
				},
				"from": {
					"type": "keyword",
					"store": true
				},
				"to": {
					"type": "keyword",
					"store": true
				},
				"sku": {
					"type": "long",
					"store": true
				}
			}
		}

	}'