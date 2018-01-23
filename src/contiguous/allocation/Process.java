
package contiguous.allocation;


public class Process {
    int processID;
    float size;
    String Status;
    float startingAddress;
   int allocBlock_StartAddress;
   float allocBlock_size;
    Process(int id ,float S)
    {
        this.processID=id;
        this.size=S;
    }
    
}
