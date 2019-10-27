package com.shadiwear.ApiHeplers;

import com.shadiwear.Models.VenderRegister;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {

    @FormUrlEncoded
    @POST("vender_register/")
    Call<VenderRegister> registerVender(
            @Field("vender_name") String venderName,
            @Field("vender_address") String venderAddress,
            @Field("vender_number") String venderNumber,
            @Field("vender_whatsapp_number") String venderWhatsappNumber,
            @Field("vender_password") String venderPassword,
            @Field("vender_city") String venderCity,
            @Field("vender_state") String venderState
    );
}
