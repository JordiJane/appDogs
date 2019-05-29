package com.example.jordi.recyclerviewactionview;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class Contact extends AppCompatActivity {

    String email;
    String password;

    EditText message;
    Button send;
    Session session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);
        message = (EditText) findViewById(R.id.mensaje);
        send = (Button) findViewById(R.id.enviarMail);

        email = "jordijane98@gmail.com";
        password = "1234";

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
                StrictMode.setThreadPolicy(policy);
                Properties properties = new Properties();
                properties.put("mail.smtp.host", "smtp.gmail.com");
                properties.put("mail.smtp.socketFactory.port", "465");
                properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
                properties.put("mail.smtp.auth", "true");
                properties.put("mail.smtp.port", "465");


                try {

                    session = Session.getDefaultInstance(properties, new Authenticator() {
                        @Override
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(email, password);
                        }
                    });

                    if (session != null){
                        javax.mail.Message message = new MimeMessage(session);
                        message.setFrom(new InternetAddress(email));
                        message.setSubject("javamail");
                        message.setRecipients(javax.mail.Message.RecipientType.TO,InternetAddress.parse("jordi1998@hotmail.es"));
                        message.setContent(Contact.this.message.getText().toString(), "text/html; charset=utf-8");
                        Transport.send(message);

                    }


                }catch (Exception e){
                    e.printStackTrace();


            }


            }
        });

    }

}
