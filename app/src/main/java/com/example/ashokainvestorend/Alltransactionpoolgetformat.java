
package com.example.ashokainvestorend;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Alltransactionpoolgetformat {

    @SerializedName("investments")
    @Expose
    private List<Investment> investments = null;

    public List<Investment> getInvestments() {
        return investments;
    }

    public void setInvestments(List<Investment> investments) {
        this.investments = investments;
    }

}
