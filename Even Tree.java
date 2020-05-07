    //forest a global variable
    public  int [] subtree(int u){
            int [] subtree = new int[V+1];
                dfsSubtree(u,-1,subtree);
            return subtree;
        }
        void dfsSubtree(int at,int parent,int [] subtree){
                subtree[at]+=1;
              for(int i=0;i<list.get(at).size();i++){
                int u = list.get(at).get(i).v;
                if(u!=parent&&u!=at){
                        dfsSubtree(u, at, subtree);
                        subtree[at]+=subtree[u];
                
                    }
                }
                if(subtree[at]%2==0&&at!=1){
                    forest++;
                    
                }
            }
