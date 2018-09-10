package biao.com;

import java.io.*;

public class seriaDemo implements Serializable {
    public seriaDemo(){}
    public String fname;
    public long fsize;
    public String fdir;
    public String user;
    public String getDirect(){
        return fdir;
    }

}

