package bin4ry.FreeXperia.KeyboardChanger;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import android.content.res.Resources;  


import bin4ry.FreeXperia.KeyboardChanger.ShellCommand.CommandResult;

import android.app.Activity;
import android.os.Bundle;

import android.app.Activity; 
import android.os.Bundle; 
import android.view.View; 
import android.view.View.OnClickListener; 
import android.widget.Button;
import android.widget.RadioButton; 
import android.widget.TextView; 

public class KeyboardChangerActivity extends Activity {

    RadioButton arRB; 
    RadioButton aroRB; 
    RadioButton atRB;
    RadioButton balRB;
    RadioButton beRB;
    RadioButton ce1RB;
    RadioButton ce2RB;
    RadioButton ce3RB;
    RadioButton chRB;
    RadioButton chttwRB;
    RadioButton cnRB;
    RadioButton czRB;
    RadioButton deRB;
    RadioButton dkRB;
    RadioButton esRB;
	RadioButton frRB;
	RadioButton gbaRB;
	RadioButton grRB;
	RadioButton hkRB;
	RadioButton hrRB;
	RadioButton ibeRB;
	RadioButton ieRB;
	RadioButton inRB;
	RadioButton itRB;
	RadioButton meaRB;
	RadioButton melRB;
	RadioButton myRB;
	RadioButton ng1RB;
	RadioButton ng2RB;
	RadioButton nlRB;
	RadioButton noRB;
	RadioButton nzRB;
	RadioButton phRB;
	RadioButton plRB;
	RadioButton ptRB;
	RadioButton roRB;
	RadioButton ruRB;
	RadioButton saRB;
	RadioButton seRB;
	RadioButton sgRB;
	RadioButton siRB;
	RadioButton skRB;
	RadioButton thRB;
	RadioButton trRB;
	RadioButton twRB;
	RadioButton uaRB;
	RadioButton ukRB;
	
    String newlayout;
    Process p;
    ShellCommand cmd = new ShellCommand();
    private Resources resources;  


    /** Called when the activity is first created. */ 
    @Override 
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.main); 



        /* 
         * Find the views declared in main.xml. 
         */ 

        arRB = (RadioButton) findViewById(R.id.rbAR); 
        aroRB = (RadioButton) findViewById(R.id.rbARO); 
        atRB = (RadioButton) findViewById(R.id.rbAT);
        balRB = (RadioButton) findViewById(R.id.rbBAL);
        beRB = (RadioButton) findViewById(R.id.rbBE);
        ce1RB = (RadioButton) findViewById(R.id.rbCE1);
        ce2RB = (RadioButton) findViewById(R.id.rbCE2);
        ce3RB = (RadioButton) findViewById(R.id.rbCE3);
        chRB = (RadioButton) findViewById(R.id.rbCH);
        chttwRB = (RadioButton) findViewById(R.id.rbCHTTW);
        cnRB = (RadioButton) findViewById(R.id.rbCN);
        czRB = (RadioButton) findViewById(R.id.rbCZ);
        deRB = (RadioButton) findViewById(R.id.rbDE);
        dkRB = (RadioButton) findViewById(R.id.rbDK);
        esRB = (RadioButton) findViewById(R.id.rbES); 
		frRB = (RadioButton) findViewById(R.id.rbFR);
		gbaRB = (RadioButton) findViewById(R.id.rbGBA);
		grRB = (RadioButton) findViewById(R.id.rbGR);
		hkRB = (RadioButton) findViewById(R.id.rbHK);
		hrRB = (RadioButton) findViewById(R.id.rbHR);
		ibeRB = (RadioButton) findViewById(R.id.rbIBE);
		ieRB = (RadioButton) findViewById(R.id.rbIE);
		inRB = (RadioButton) findViewById(R.id.rbIN);
		itRB = (RadioButton) findViewById(R.id.rbIT);
		meaRB = (RadioButton) findViewById(R.id.rbMEA);
		melRB = (RadioButton) findViewById(R.id.rbMEL);
		myRB = (RadioButton) findViewById(R.id.rbMY);
		ng1RB = (RadioButton) findViewById(R.id.rbNG1);
		ng2RB = (RadioButton) findViewById(R.id.rbNG2);
		nlRB = (RadioButton) findViewById(R.id.rbNL);
		noRB = (RadioButton) findViewById(R.id.rbNO);
		nzRB = (RadioButton) findViewById(R.id.rbNZ);
		phRB = (RadioButton) findViewById(R.id.rbPH);
		plRB = (RadioButton) findViewById(R.id.rbPL);
		ptRB = (RadioButton) findViewById(R.id.rbPT);
		roRB = (RadioButton) findViewById(R.id.rbRO);
		ruRB = (RadioButton) findViewById(R.id.rbRU);
		saRB = (RadioButton) findViewById(R.id.rbSA);
		seRB = (RadioButton) findViewById(R.id.rbSE);
		sgRB = (RadioButton) findViewById(R.id.rbSG);
		skRB = (RadioButton) findViewById(R.id.rbSK);
		siRB = (RadioButton) findViewById(R.id.rbSI);
		thRB = (RadioButton) findViewById(R.id.rbTH);
		trRB = (RadioButton) findViewById(R.id.rbTR);
		twRB = (RadioButton) findViewById(R.id.rbTW);
		uaRB = (RadioButton) findViewById(R.id.rbUA);
		ukRB = (RadioButton) findViewById(R.id.rbUK);

		

        /* 
         * Set a listener that will listen for clicks on the radio buttons and 
         * perform suitable actions. 
         */ 
    arRB.setOnClickListener(radio_listener);  
    aroRB.setOnClickListener(radio_listener);  
    atRB.setOnClickListener(radio_listener); 
    balRB.setOnClickListener(radio_listener); 
    beRB.setOnClickListener(radio_listener); 
    ce1RB.setOnClickListener(radio_listener); 
    ce2RB.setOnClickListener(radio_listener); 
    ce3RB.setOnClickListener(radio_listener); 
    chRB.setOnClickListener(radio_listener); 
    chttwRB.setOnClickListener(radio_listener); 
    cnRB.setOnClickListener(radio_listener); 
    czRB.setOnClickListener(radio_listener); 
    deRB.setOnClickListener(radio_listener);
    dkRB.setOnClickListener(radio_listener); 
    esRB.setOnClickListener(radio_listener); 
	frRB.setOnClickListener(radio_listener); 
	gbaRB.setOnClickListener(radio_listener); 
	grRB.setOnClickListener(radio_listener); 
	hkRB.setOnClickListener(radio_listener); 
	hrRB.setOnClickListener(radio_listener); 
	ibeRB.setOnClickListener(radio_listener); 
	ieRB.setOnClickListener(radio_listener); 
	inRB.setOnClickListener(radio_listener); 
	itRB.setOnClickListener(radio_listener); 
	meaRB.setOnClickListener(radio_listener); 
	melRB.setOnClickListener(radio_listener); 
	myRB.setOnClickListener(radio_listener); 
	ng1RB.setOnClickListener(radio_listener); 
	ng2RB.setOnClickListener(radio_listener); 
	nlRB.setOnClickListener(radio_listener); 
	noRB.setOnClickListener(radio_listener); 
	nzRB.setOnClickListener(radio_listener); 
	phRB.setOnClickListener(radio_listener); 
	plRB.setOnClickListener(radio_listener); 
	ptRB.setOnClickListener(radio_listener); 
	roRB.setOnClickListener(radio_listener); 
	ruRB.setOnClickListener(radio_listener); 
	saRB.setOnClickListener(radio_listener); 
	seRB.setOnClickListener(radio_listener); 
	sgRB.setOnClickListener(radio_listener); 
	siRB.setOnClickListener(radio_listener); 
	skRB.setOnClickListener(radio_listener); 
	thRB.setOnClickListener(radio_listener); 
	trRB.setOnClickListener(radio_listener); 
	twRB.setOnClickListener(radio_listener); 
	uaRB.setOnClickListener(radio_listener); 
	ukRB.setOnClickListener(radio_listener); 

	cmd.su.run("busybox mount -o remount,rw /system");
        
      final Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                InputStream iS1;
        		InputStream iS2; 
        		resources = getResources(); 
            	
				try {
					cmd.su.run("chmod 777 /data/local/tmp");
					iS1 = resources.getAssets().open("qwerty."+newlayout+".bin");
					iS2 = resources.getAssets().open("qwerty."+newlayout+".kl");
					byte[] buffer1 = new byte[iS1.available()];
					byte[] buffer2 = new byte[iS2.available()];
					iS1.read(buffer1);
					iS2.read(buffer2);
					OutputStream oS1 = new FileOutputStream ("/data/local/tmp/qwerty.kcm.bin");
					OutputStream oS2 = new FileOutputStream ("/data/local/tmp/qwerty.kl");
					ByteArrayOutputStream baoS1 = new ByteArrayOutputStream();  
					ByteArrayOutputStream baoS2 = new ByteArrayOutputStream();  
					baoS1.write(buffer1);
					baoS2.write(buffer2);
					baoS1.writeTo(oS1);
					baoS2.writeTo(oS2);
					iS1.close();
					iS2.close();
					oS1.close();
					oS2.close();
					baoS1.close();
					baoS2.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}

				cmd.su.run("rm /system/usr/keychars/qwerty.kcm.bin");
				cmd.su.run("cp /data/local/tmp/qwerty.kcm.bin" + " /system/usr/keychars/qwerty.kcm.bin");
				cmd.su.run("rm /system/usr/keylayout/qwerty.kl");
				cmd.su.run("cp /data/local/tmp/qwerty.kl" + " /system/usr/keylayout/qwerty.kl");
				cmd.su.run("chmod 644 /system/usr/keychars/qwerty.kcm.bin");
				cmd.su.run("chmod 644 /system/usr/keylayout/qwerty.kl");
				cmd.su.run("rm /data/local/tmp/qwerty.*");
		
                try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                cmd.su.run("busybox mount -o remount,ro /system");
                try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                cmd.su.run("reboot");
                }
        }); 
        } 
    
    private OnClickListener radio_listener = new OnClickListener() {
        public void onClick(View v) { 
            switch (v.getId()) { 
            case R.id.rbAR: 
                newlayout = "AR";
                break; 
            case R.id.rbARO: 
            	newlayout = "ARO";
                break; 
            case R.id.rbAT: 
            	newlayout = "AT";
                break;
            case R.id.rbBAL: 
                    newlayout = "BAL";
                break; 
            case R.id.rbBE: 
                    newlayout = "BE";
                break; 
            case R.id.rbCE1: 
                    newlayout = "CE1";
                break; 
            case R.id.rbCE2: 
                    newlayout = "CE2";
                break; 
            case R.id.rbCE3: 
                    newlayout = "CE3";
                break; 
            case R.id.rbCH: 
                    newlayout = "CH";
                break; 
            case R.id.rbCHTTW: 
                    newlayout = "CHT-TW";
                break; 
            case R.id.rbCN: 
                    newlayout = "CN";
                break; 
            case R.id.rbCZ: 
                    newlayout = "CZ";
                break; 
            case R.id.rbDE: 
                    newlayout = "DE";
                break; 
            case R.id.rbDK:
                    newlayout = "DK";
                break; 
            case R.id.rbES: 
                    newlayout = "ES";
                break; 
			case R.id.rbFR: 
                    newlayout = "FR";
                break; 
			case R.id.rbGBA: 
                    newlayout = "GBA";
                break; 
			case R.id.rbGR: 
                    newlayout = "GR";
                break; 
			case R.id.rbHK: 
                    newlayout = "HK";
                break; 
			case R.id.rbHR: 
                    newlayout = "HR";
                break; 
			case R.id.rbIBE: 
                    newlayout = "IBE";
                break; 
			case R.id.rbIE: 
                    newlayout = "IE";
                break; 
			case R.id.rbIN: 
                    newlayout = "IN";
                break; 
			case R.id.rbIT: 
                    newlayout = "IT";
                break; 
			case R.id.rbMEA: 
                    newlayout = "MEA";
                break;
			case R.id.rbMEL: 
                    newlayout = "MEL";
                break; 
			case R.id.rbMY: 
                    newlayout = "MY";
                break; 
			case R.id.rbNG1: 
                    newlayout = "NG1";
                break;
			case R.id.rbNG2: 
                    newlayout = "NG2";
                break; 
			case R.id.rbNL: 
                    newlayout = "NL";
                break; 
			case R.id.rbNO: 
                    newlayout = "NO";
                break; 
			case R.id.rbNZ: 
                    newlayout = "NZ";
                break; 
			case R.id.rbPH: 
                    newlayout = "PH";
                break; 
			case R.id.rbPL: 
                    newlayout = "PL";
                break; 
			case R.id.rbPT: 
                    newlayout = "OT";
                break; 
			case R.id.rbRO: 
                    newlayout = "RO";
                break; 
			case R.id.rbRU: 
                    newlayout = "RU";
                break; 
			case R.id.rbSA: 
                    newlayout = "SA";
                break; 
			case R.id.rbSE: 
                    newlayout = "SE";
                break; 
			case R.id.rbSG: 
                    newlayout = "SG";
                break; 
			case R.id.rbSI: 
                    newlayout = "SI";
                break; 
			case R.id.rbSK: 
                    newlayout = "SK";
                break; 
			case R.id.rbTH: 
                    newlayout = "TH";
                break; 
			case R.id.rbTR: 
                    newlayout = "TR";
                break; 
			case R.id.rbTW: 
                    newlayout = "TW";
                break; 
			case R.id.rbUA: 
                    newlayout = "UA";
                break; 
			case R.id.rbUK: 
                    newlayout = "UK";
                break; 
           default: 
            } 
        } 
    }; 
}