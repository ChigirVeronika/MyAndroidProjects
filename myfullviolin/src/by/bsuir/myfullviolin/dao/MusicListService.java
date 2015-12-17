package by.bsuir.myfullviolin.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.util.List;

public class MusicListService {
	private DBOpenHelper dbOpenHelper;		
	
	public MusicListService(Context context) {
		super();
		this.dbOpenHelper = new DBOpenHelper(context, "MusicList", null, 0);
	}

	public void save(Music music){

		SQLiteDatabase db = dbOpenHelper.getWritableDatabase();
		//db.execSQL("insert into MusicList(name,url) values('"+music.getName()+"','"+music.getUrl()+"')");
	
		db.execSQL("insert into MusicList(name,url) values(?,?)", new Object[]{music.getName(),music.getUrl()});
		db.close();
	}
	
	public void  delete(Integer id){
		SQLiteDatabase db = dbOpenHelper.getWritableDatabase();
		db.execSQL("DELETE from MusicList where id=?",new Object[]{id});
		db.close();
	}
	
    public void  update(Music music){
		
	}
	
    public Music find(Integer id){
		return null;
	}

    public List<Music> getScrollData(int offset,int macResult){
		return null;
	}
    
    public long getcount(Integer id){
		return 0;
	}
}
