package sreekanth.b3cgp;

import sreekanth.b3cgp.util.SystemUiHider;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 *
 * @see SystemUiHider
 */
    public class
        FullscreenActivity extends Activity {
        EditText Javamid1,Javamid2,Javaasg,Javasem,Esmid1,Esmid2,Esasg,Essem,Comid1,Comid2,Coasg,Cosem,Osmid1,Osmid2,Osasg,Ossem,Semid1,Semid2,Seasg,Sesem,Javalab,Oslab,Cewlab;
        TextView Result;
        Button calculate;
    /**
     * Whether or not the system UI should be auto-hidden after
     * {@link #AUTO_HIDE_DELAY_MILLIS} milliseconds.
     */
    private static final boolean AUTO_HIDE = false;

    /**
     * If {@link #AUTO_HIDE} is set, the number of milliseconds to wait after
     * user interaction before hiding the system UI.
     */
    private static final int AUTO_HIDE_DELAY_MILLIS = 3000;

    /**
     * If set, will toggle the system UI visibility upon interaction. Otherwise,
     * will show the system UI visibility upon interaction.
     */
    private static final boolean TOGGLE_ON_CLICK = true;

    /**
     * The flags to pass to {@link SystemUiHider#getInstance}.
     */
    private static final int HIDER_FLAGS = SystemUiHider.FLAG_HIDE_NAVIGATION;

    /**
     * The instance of the {@link SystemUiHider} for this activity.
     */
    private SystemUiHider mSystemUiHider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fullscreen);

        Javamid1 = (EditText) findViewById(R.id.javamid1);
        Javamid2 = (EditText) findViewById(R.id.javamid2);
        Javaasg = (EditText) findViewById(R.id.javaasg);
        Javasem = (EditText) findViewById(R.id.javasem);
        Esmid1 = (EditText) findViewById(R.id.esmid1);
        Esmid2 = (EditText) findViewById(R.id.esmid2);
        Esasg = (EditText) findViewById(R.id.esasg);
        Essem = (EditText) findViewById(R.id.essem);
        Comid1 = (EditText) findViewById(R.id.comid1);
        Comid2 = (EditText) findViewById(R.id.comid2);
        Coasg = (EditText) findViewById(R.id.coasg);
        Cosem = (EditText) findViewById(R.id.cosem);
        Osmid1 = (EditText) findViewById(R.id.osmid1);
        Osmid2 = (EditText) findViewById(R.id.osmid2);
        Osasg = (EditText) findViewById(R.id.osasg);
        Ossem = (EditText) findViewById(R.id.ossem);
        Semid1 = (EditText) findViewById(R.id.semid1);
        Semid2 = (EditText) findViewById(R.id.semid2);
        Seasg = (EditText) findViewById(R.id.seasg);
        Sesem = (EditText) findViewById(R.id.sesem);
        Javalab = (EditText) findViewById(R.id.javalabin);
        Oslab = (EditText) findViewById(R.id.oslabin);
        Cewlab = (EditText) findViewById(R.id.cewlabin);
        Result = (TextView) findViewById(R.id.result);
        calculate = (Button) findViewById(R.id.cal);


        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    float jm1 = Integer.parseInt(Javamid1.getText().toString());
                    float jm2 = Integer.parseInt(Javamid2.getText().toString());
                    float ja = Integer.parseInt(Javaasg.getText().toString());
                    float js = Integer.parseInt(Javasem.getText().toString());
                    float em1 = Integer.parseInt(Esmid1.getText().toString());
                    float em2 = Integer.parseInt(Esmid2.getText().toString());
                    float ea = Integer.parseInt(Esasg.getText().toString());
                    float es = Integer.parseInt(Essem.getText().toString());
                    float cm1 = Integer.parseInt(Comid1.getText().toString());
                    float cm2 = Integer.parseInt(Comid2.getText().toString());
                    float ca = Integer.parseInt(Coasg.getText().toString());
                    float cs = Integer.parseInt(Cosem.getText().toString());
                    float om1 = Integer.parseInt(Osmid1.getText().toString());
                    float om2 = Integer.parseInt(Osmid2.getText().toString());
                    float oa = Integer.parseInt(Osasg.getText().toString());
                    float os = Integer.parseInt(Ossem.getText().toString());
                    float sm1 = Integer.parseInt(Semid1.getText().toString());
                    float sm2 = Integer.parseInt(Semid2.getText().toString());
                    float sa = Integer.parseInt(Seasg.getText().toString());
                    float ss = Integer.parseInt(Sesem.getText().toString());
                    float jl = Integer.parseInt(Javalab.getText().toString());
                    float ol = Integer.parseInt(Oslab.getText().toString());
                    float cl = Integer.parseInt(Cewlab.getText().toString());
                    int jp=(int)(((jm1 + jm2) / 2.0 + ja + js) / 10);
                    int ep=(int)(((em1 + em2) / 2.0 + ea + es) / 10);
                    int cp=(int)(((cm1 + cm2) / 2.0 + ca + cs) / 10);
                    int op=(int)(((om1 + om2) / 2.0 + oa + os) / 10);
                    int sp=(int)(((sm1 + sm2) / 2.0 + sa + ss) / 10);
                    int jlp=(int)(jl / 10);
                    int olp=(int)(ol / 10);
                    int clp=(int)(cl / 10);
                    if(jp==10)
                        jp--;
                    if(ep==10)
                        ep--;
                    if(cp==10)
                        cp--;
                    if(op==10)
                        op--;
                    if(sp==10)
                        sp--;
                    float jc = 4, ec = 4, cc = 4, oc = 3, sc = 4, jlc = 2, olc =2, clc = 2;
                    float cgp = ((((jp)+1)*jc)+(((ep)+1)*ec)+(((cp)+1)*cc)+(((op)+1)*oc)+(((sp)+1)*sc)+(((jlp)+1)*jlc)+(((olp)+1)*olc)+(((clp)+1)*clc))/(jc + ec + cc + oc + sc + jlc + olc + clc)*1.0f;
                    int cgpint=(int)(cgp*100);
                    double cgpfin=cgpint/100.0;

                    if(jm1>30||em1>30||cm1>30||om1>30||sm1>30||jm2>30||em1>30||cm2>30||om2>30||om2>30){
                        Result.setTextSize(TypedValue.COMPLEX_UNIT_DIP,10);
                        Result.setTextColor(Color.parseColor("#ff0000"));
                        Result.setText("You cant get more than 30 in mids\n");
                    }
                    if(ja>10||ea>10||ca>10||oa>10||sa>10){
                        Result.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 10);
                        Result.setTextColor(Color.parseColor("#ff0000"));
                        String temp = Result.getText()+"You cant get more than 10 in Assignment\n";
                        Result.setText(temp);
                    }
                    if(js>60||es>60||cs>60||os>60||ss>60){
                        Result.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 10);
                        Result.setTextColor(Color.parseColor("#ff0000"));
                        String temp = Result.getText()+"You cant get more than 60 in Sem-end Exam\n";
                        Result.setText(temp);
                    }
                    if(jl>100||ol>100||cl>100){
                        Result.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 10);
                        Result.setTextColor(Color.parseColor("#ff0000"));
                        String temp = Result.getText()+"You cant get more than 100 in Labs\n";
                        Result.setText(temp);
                    }
                    if(jc<=30&&em1<=30&&cm1<=30&&om1<=30&&sm1<=30&&jm2<=30&&em2<=30&&cm2<=30&&om2<=30&&sm2<=30&&ja<=10&&ea<=10&&ca<=10&&oa<=10&&sa<=10&&js<=60&&es<=60&&cs<=60&&os<=60&&ss<=60&&jl<=100&&ol<=100&&cl<=100){
                        Result.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 50);
                        Result.setTextColor(Color.parseColor("#00ff00"));
                        Result.setText(String.valueOf(cgpfin));
                        if(jp<4||ep<4||cp<4||op<4||sp<4||jlp<4||olp<4||clp<4){
                            Result.setTextSize(TypedValue.COMPLEX_UNIT_DIP,50);
                            Result.setTextColor(Color.parseColor("#ff0000"));
                            Result.setText("0.0");
                        }
                    }


                } catch (Exception e) {

                }
            }
        });


        final View controlsView = findViewById(R.id.fullscreen_content_controls);
        final View contentView = findViewById(R.id.fullscreen_content);

        // Set up an instance of SystemUiHider to control the system UI for
        // this activity.
        mSystemUiHider = SystemUiHider.getInstance(this, contentView, HIDER_FLAGS);
        mSystemUiHider.setup();
        mSystemUiHider
                .setOnVisibilityChangeListener(new SystemUiHider.OnVisibilityChangeListener() {
                    // Cached values.
                    int mControlsHeight;
                    int mShortAnimTime;

                    @Override
                    @TargetApi(Build.VERSION_CODES.HONEYCOMB_MR2)
                    public void onVisibilityChange(boolean visible) {
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR2) {
                            // If the ViewPropertyAnimator API is available
                            // (Honeycomb MR2 and later), use it to animate the
                            // in-layout UI controls at the bottom of the
                            // screen.
                            if (mControlsHeight == 0) {
                                mControlsHeight = controlsView.getHeight();
                            }
                            if (mShortAnimTime == 0) {
                                mShortAnimTime = getResources().getInteger(
                                        android.R.integer.config_shortAnimTime);
                            }
                            controlsView.animate()
                                    .translationY(visible ? 0 : mControlsHeight)
                                    .setDuration(mShortAnimTime);
                        } else {
                            // If the ViewPropertyAnimator APIs aren't
                            // available, simply show or hide the in-layout UI
                            // controls.
                            controlsView.setVisibility(visible ? View.VISIBLE : View.GONE);
                        }

                        if (visible && AUTO_HIDE) {
                            // Schedule a hide().
                            delayedHide(AUTO_HIDE_DELAY_MILLIS);
                        }
                    }
                });

        // Set up the user interaction to manually show or hide the system UI.
        contentView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TOGGLE_ON_CLICK) {
                    mSystemUiHider.toggle();
                } else {
                    mSystemUiHider.show();
                }
            }
        });

        // Upon interacting with UI controls, delay any scheduled hide()
        // operations to prevent the jarring behavior of controls going away
        // while interacting with the UI.
       // findViewById(R.id.dummy_button).setOnTouchListener(mDelayHideTouchListener);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        // Trigger the initial hide() shortly after the activity has been
        // created, to briefly hint to the user that UI controls
        // are available.
        delayedHide(100);
    }


    /**
     * Touch listener to use for in-layout UI controls to delay hiding the
     * system UI. This is to prevent the jarring behavior of controls going away
     * while interacting with activity UI.
     */
    View.OnTouchListener mDelayHideTouchListener = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (AUTO_HIDE) {
                delayedHide(AUTO_HIDE_DELAY_MILLIS);
            }
            return false;
        }
    };

    Handler mHideHandler = new Handler();
    Runnable mHideRunnable = new Runnable() {
        @Override
        public void run() {
            mSystemUiHider.hide();
        }
    };

    /**
     * Schedules a call to hide() in [delay] milliseconds, canceling any
     * previously scheduled calls.
     */
    private void delayedHide(int delayMillis) {
        mHideHandler.removeCallbacks(mHideRunnable);
        mHideHandler.postDelayed(mHideRunnable, delayMillis);
    }
}
