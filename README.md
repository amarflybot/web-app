cf create-service -c '{ "git": { "uri": "https://github.com/amarraja123/config", "label": "master"  } }' p-config-server standard config-server

cf create-service p-service-registry standard service-registry

cf create-service p-circuit-breaker-dashboard standard circuit-breaker-dashboard

curl -X POST http://webapp.local.pcfdev.io/refresh