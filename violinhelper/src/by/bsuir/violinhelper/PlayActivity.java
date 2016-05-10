package by.bsuir.violinhelper;

import android.app.Activity;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import by.bsuir.myfullviolin.R;
import by.bsuir.myfullviolin.model.sound.ViolinSoundPool;

import java.util.HashMap;

/**
 * Created by �������� on 12.12.2015.
 */
public class PlayActivity extends Activity {
    private ImageButton imageButton_m1;
    private ImageButton imageButton_m2;
    private ImageButton imageButton_m3;
    private ImageButton imageButton_m4;
    private ImageButton imageButton_m5;
    private ImageButton imageButton_m6;
    private ImageButton imageButton_m7;
    private ImageButton imageButton_m8;
    private static final int ALL_STREAMS=8;//������������ ���-�� ������������ ��������������� ������

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        imageButton_m1 = (ImageButton) findViewById(R.id.ImageButton_m1);
        imageButton_m2 = (ImageButton) findViewById(R.id.ImageButton_m2);
        imageButton_m3 = (ImageButton) findViewById(R.id.ImageButton_m3);
        imageButton_m4 = (ImageButton) findViewById(R.id.ImageButton_m4);
        imageButton_m5 = (ImageButton) findViewById(R.id.ImageButton_m5);
        imageButton_m6 = (ImageButton) findViewById(R.id.ImageButton_m6);
        imageButton_m7 = (ImageButton) findViewById(R.id.ImageButton_m7);
        imageButton_m8 = (ImageButton) findViewById(R.id.ImageButton_m8);
//���� ��� ��������� ���� ���� � ������ � ������ ��� �������������
        SoundPool soundPoll= new SoundPool(ALL_STREAMS, AudioManager.STREAM_MUSIC, 0);
                                                        //��� �����-������..0 - �������� ����������� ��� �� �������
        HashMap<Integer,Integer> soundPoolMap= new HashMap<Integer, Integer>();

        final ViolinSoundPool violinSoundPool = new ViolinSoundPool(this,soundPoolMap,soundPoll);

        violinSoundPool.soundPoolLoadTest();

        imageButton_m1.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    try {
                        violinSoundPool.play(violinSoundPool.soundPoolMap.get(1), 1, 1, 0, 0, 1);
                        Toast.makeText(getApplicationContext(), "Note C",
                                Toast.LENGTH_SHORT).show();
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    try {
                        violinSoundPool.pause(violinSoundPool.soundPoolMap.get(1));
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                return false;
            }
        });
        imageButton_m2.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int i = 0;
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    try {
                        i=	violinSoundPool.play(violinSoundPool.soundPoolMap.get(2), 1, 1, 0, 0, 1);
                        Toast.makeText(getApplicationContext(), "Note D",
                                Toast.LENGTH_SHORT).show();
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    try {
                        violinSoundPool.stop(i);
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                return false;
            }
        });
        imageButton_m3.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int i = 0;
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    try {
                        i =violinSoundPool.play(violinSoundPool.soundPoolMap.get(3), 1, 1, 0, 0, 1);
                        Toast.makeText(getApplicationContext(), "Note E",
                                Toast.LENGTH_SHORT).show();
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    try {
                        violinSoundPool.stop(i);
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                return false;
            }
        });
        imageButton_m4.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    try {
                        violinSoundPool.play(violinSoundPool.soundPoolMap.get(4), 1, 1, 0, 0, 1);
                        Toast.makeText(getApplicationContext(), "Note F",
                                Toast.LENGTH_SHORT).show();
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    try {
                        violinSoundPool.stop(violinSoundPool.soundPoolMap.get(4));
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                return false;
            }
        });
        imageButton_m5.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    try {
                        violinSoundPool.play(violinSoundPool.soundPoolMap.get(5), 1, 1, 0, 0, 1);
                        Toast.makeText(getApplicationContext(), "Note G",
                                Toast.LENGTH_SHORT).show();
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    try {
                        violinSoundPool.stop(violinSoundPool.soundPoolMap.get(5));
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                return false;
            }
        });
        imageButton_m6.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    try {
                        violinSoundPool.play(violinSoundPool.soundPoolMap.get(6), 1, 1, 0, 0, 1);
                        Toast.makeText(getApplicationContext(), "Note A",
                                Toast.LENGTH_SHORT).show();
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    try {
                        violinSoundPool.stop(violinSoundPool.soundPoolMap.get(6));
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                return false;
            }
        });
        imageButton_m7.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    try {
                        violinSoundPool.play(violinSoundPool.soundPoolMap.get(7), 1, 1, 0, 0, 1);
                        Toast.makeText(getApplicationContext(), "Note B",
                                Toast.LENGTH_SHORT).show();
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    try {
                        violinSoundPool.stop(violinSoundPool.soundPoolMap.get(7));
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                return false;
            }
        });
        imageButton_m8.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    try {
                        violinSoundPool.play(violinSoundPool.soundPoolMap.get(8), 1, 1, 0, 0, 1);
                        Toast.makeText(getApplicationContext(), "Note C",
                                Toast.LENGTH_SHORT).show();
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    try {
                        violinSoundPool.stop(violinSoundPool.soundPoolMap.get(8));
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                return false;
            }
        });

    }

    protected void onDestroy() {
        super.onDestroy();

    }

    public void showToast(View view, String noteName) {
        Toast toast = Toast.makeText(getApplicationContext(),
                noteName, Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        LinearLayout toastContainer = (LinearLayout) toast.getView();
        ImageView catImageView = new ImageView(getApplicationContext());
        catImageView.setImageResource(R.drawable.music);
        toastContainer.addView(catImageView, 0);
        toast.show();
    }
}
