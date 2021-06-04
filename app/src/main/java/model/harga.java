package model;

import android.os.Parcel;
import android.os.Parcelable;

public class harga implements Parcelable {

    private String harga1 = "1.000.000";
    private String harga2 = "2.000.000";
    private String harga3 = "3.000.000";

    public String getHarga1() {
        return harga1;
    }

    public String getHarga2() {
        return harga2;
    }

    public String getHarga3() {
        return harga3;
    }

    public harga(String harga1, String harga2, String harga3) {
        this.harga1 = harga1;
        this.harga2 = harga2;
        this.harga3 = harga3;
    }

    protected harga(Parcel in) {
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<harga> CREATOR = new Creator<harga>() {
        @Override
        public harga createFromParcel(Parcel in) {
            return new harga(in);
        }

        @Override
        public harga[] newArray(int size) {
            return new harga[size];
        }
    };
}
