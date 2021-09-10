/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoPublic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author HUYNH HUY
 */
public class quanLyCanBo {
    private List<canBo> canBos;

    public quanLyCanBo() {
        this.canBos=new ArrayList<>();
        
    }
    public void themCanBo(canBo can)
    {
        this.canBos.add(can);
    }
    public List<canBo> timCanBo(String name)
    {
        return this.canBos.stream().filter(o->o.getHoTen().contains(name)).collect(Collectors.toList());
    }
    public void xemCanBo()
    {
        this.canBos.forEach(o->System.err.println(o.toString()));
    }
   
    
    
}
