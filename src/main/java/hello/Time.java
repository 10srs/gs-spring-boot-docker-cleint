package hello;

import java.util.Date;
import com.amazonaws.util.EC2MetadataUtils;

public class Time {

    private String time = new Date().toString();



    private String machineId = EC2MetadataUtils.getInstanceId();

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMachineId() {
        return machineId;
    }

    public void setMachineId(String machineId) {
        this.machineId = machineId;
    }
}
