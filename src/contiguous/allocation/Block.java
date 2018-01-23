/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contiguous.allocation;


public class Block {
    int blockStartingAddress;
     int blockID;
    float OriginalblockSize;
    float blockSize;
    int allocProcessID;
    float allocProcessSize;
   String  status="not allocated";
    Block(int i,float s)
    {
        this.blockStartingAddress=i;
        this.OriginalblockSize=s;
        this.blockSize=s;
    }
    
    
}
