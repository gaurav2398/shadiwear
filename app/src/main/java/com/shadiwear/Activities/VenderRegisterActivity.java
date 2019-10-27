package com.shadiwear.Activities;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.shadiwear.ApiHeplers.ApiInterface;
import com.shadiwear.ApiHeplers.RetroClient;
import com.shadiwear.Models.VenderRegister;
import com.shadiwear.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class VenderRegisterActivity extends AppCompatActivity {
    private static final String TAG = VenderRegisterActivity.class.getSimpleName();

    private EditText nameEdt, addressEdt, stateEdt, passwordEdt, cityEdt, mobileNumberEdt, edtWhatsappNumber;
    private Button registerVenderBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vender_register);

        nameEdt = findViewById(R.id.edt_name);
        stateEdt = findViewById(R.id.edt_state);
        passwordEdt = findViewById(R.id.edt_password);
        cityEdt = findViewById(R.id.edt_city);
        mobileNumberEdt = findViewById(R.id.edt_mobile_number);
        edtWhatsappNumber = findViewById(R.id.edt_whatsapp_number);
        addressEdt = findViewById(R.id.edt_address);

        registerVenderBtn = findViewById(R.id.btn_register_vender);

        registerVenderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String mobilePattern = "[0-9]{10}";

                if (nameEdt.getText().toString().trim().length() > 0) {
                    if (addressEdt.getText().toString().trim().length() > 0) {
                        if (mobileNumberEdt.getText().toString().trim().length() > 0) {
                            if (mobileNumberEdt.getText().toString().trim().matches(mobilePattern)) {
                                if (edtWhatsappNumber.getText().toString().trim().matches(mobilePattern)) {
                                    if (passwordEdt.getText().toString().trim().length() > 0) {
                                        if (cityEdt.getText().toString().trim().length() > 0) {
                                            if (stateEdt.getText().toString().trim().length() > 0) {
                                                registerVender(nameEdt.getText().toString().trim(),
                                                        addressEdt.getText().toString().trim(),
                                                        mobileNumberEdt.getText().toString().trim(),
                                                        edtWhatsappNumber.getText().toString().trim(),
                                                        passwordEdt.getText().toString().trim(),
                                                        cityEdt.getText().toString().trim(),
                                                        stateEdt.getText().toString().trim());
                                            } else {
                                                validate();
                                            }
                                        } else {
                                            validate();
                                        }
                                    } else {
                                        validate();
                                    }

                                } else {
                                    validate();
                                }
                            } else {
                                validate();
                            }
                        } else {
                            validate();
                        }
                    } else {
                        validate();
                    }
                } else {
                    validate();
                }
            }
        });
    }

    private void validate() {
        String mobilePattern = "[0-9]{10}";

        if (nameEdt.getText().toString().trim().length() <= 0) {
            Toast.makeText(this, "Name is required!", Toast.LENGTH_SHORT).show();
        } else if (addressEdt.getText().toString().trim().length() <= 0) {
            Toast.makeText(this, "Address is required!", Toast.LENGTH_SHORT).show();
        } else if (mobileNumberEdt.getText().toString().trim().length() <= 0) {
            Toast.makeText(this, "Mobile number is required!", Toast.LENGTH_SHORT).show();
        } else if (!mobileNumberEdt.getText().toString().trim().matches(mobilePattern)) {
            Toast.makeText(this, "Invalid mobile number!", Toast.LENGTH_SHORT).show();
        } else if (!edtWhatsappNumber.getText().toString().trim().matches(mobilePattern)) {
            Toast.makeText(this, "Invalid WhatsApp number!", Toast.LENGTH_SHORT).show();
        } else if (passwordEdt.getText().toString().trim().length() <= 0) {
            Toast.makeText(this, "Password is required!", Toast.LENGTH_SHORT).show();
        } else if (cityEdt.getText().toString().trim().length() <= 0) {
            Toast.makeText(this, "City is required!", Toast.LENGTH_SHORT).show();
        } else if (stateEdt.getText().toString().trim().length() <= 0) {
            Toast.makeText(this, "State is required!", Toast.LENGTH_SHORT).show();
        }
    }

    private void registerVender(String venderName, String venderAddress, String
            venderNumber, String venderWhatsAppNumber, String venderPassword, String
                                        venderCity, String venderState) {


        //region Redirect to WhatsApp
//        String text = "Hello, Admin sir";
//        Intent intent = new Intent(Intent.ACTION_VIEW);
//        intent.setData(Uri.parse("http://api.whatsapp.com/send?phone=+91" + venderWhatsAppNumber + "&text=" + text));
//        startActivity(intent);
        //endregion

        ApiInterface apiInterface = RetroClient.getClient().create(ApiInterface.class);
        Call<VenderRegister> call = apiInterface.registerVender(venderName, venderAddress, venderNumber, venderWhatsAppNumber, venderPassword, venderCity, venderState);
        call.enqueue(new Callback<VenderRegister>() {
            @Override
            public void onResponse(Call<VenderRegister> call, Response<VenderRegister> response) {
                String register = String.valueOf(response.body());
                Toast.makeText(VenderRegisterActivity.this, "Response : " + register, Toast.LENGTH_SHORT).show();
                Log.d(TAG, "onResponse: ");
            }

            @Override
            public void onFailure(Call<VenderRegister> call, Throwable t) {
                Log.d(TAG, "on Error: " + t);
            }
        });
    }
}