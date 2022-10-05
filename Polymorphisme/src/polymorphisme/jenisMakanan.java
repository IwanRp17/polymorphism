/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphisme;

/**
 *
 * @author ngend
 */
public class jenisMakanan extends makanan {
    private String makanan,daerah;
    
    public jenisMakanan(){
    makanan="Gudeg";
    daerah="jogjakarta";
    }
    
    public jenisMakanan(String makanan,String daerah){
    this.makanan=makanan;
    this.daerah=daerah;
    }
    
    @Override
    public String toString(){
    return "nama="+makanan +" dari daerah="+daerah;
    }
           
}
