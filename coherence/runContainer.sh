docker run -itd --name=datagrid --hostname=datagrid --net=jbcn-net  -p 7574:7574 -e COH_CLUSTER_NAME=jbcn-coherence-cluster jbcn/datagrid:1.0.0
