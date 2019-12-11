
package com.superjeevan.googol2019maven;

public class IMDb {
    
    public IMDb(String cmd){
        
        if(cmd.toLowerCase().contains("is") || cmd.toLowerCase().contains("good") || cmd.toLowerCase().contains("list of")){
                    IMDb_Current top100 = new IMDb_Current();
                    IMDb_Overall top250 = new IMDb_Overall();
                    String tempCmd[] = cmd.toLowerCase().split(" ");
                    String tempTitle = "";
                    
                    for(int i = 0; i < tempCmd.length; i++){
                        
                        if(tempCmd[i].equalsIgnoreCase("is") || tempCmd[i].equalsIgnoreCase("a") || tempCmd[i].equalsIgnoreCase("good") || tempCmd[i].equalsIgnoreCase("list")|| tempCmd[i].equalsIgnoreCase("of")){
                            
                        }else{
                            if(tempCmd[i].equalsIgnoreCase("movie?") || tempCmd[i].equalsIgnoreCase("movie") || tempCmd[i].equalsIgnoreCase("movies")){
                                continue;
                            }
                            tempTitle += tempCmd[i];
                        }
                        
                    }
//                    if(i == tempCmd.length-1){
                        System.out.println("In Top 250 in IMDb: ");
                        top250.getRank(tempTitle);
                        System.out.println("\nIn Top 100 in IMDb: ");
                        top100.getRank(tempTitle);
                        System.out.println("\nDone checking on IMDb.");
//                        break;
//                    }
                }
                
                else if(cmd.toLowerCase().contains("current")){
                    IMDb_Current top100 = new IMDb_Current();
                    top100.displayList();
                } else {
                    IMDb_Overall top250 = new IMDb_Overall();
                    top250.displayList();
                }
        
    }
    
}
