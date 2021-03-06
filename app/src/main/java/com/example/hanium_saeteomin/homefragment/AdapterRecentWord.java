package com.example.hanium_saeteomin.homefragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.hanium_saeteomin.R;

import java.util.ArrayList;

public class AdapterRecentWord extends RecyclerView.Adapter<AdapterRecentWord.ViewHolder> {

    private ArrayList<String> mData = null ;

    // 아이템 뷰를 저장하는 뷰홀더 클래스.
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_recent_word ;

        ViewHolder(View itemView) {
            super(itemView) ;

            // 뷰 객체에 대한 참조. (hold strong reference)
            tv_recent_word = itemView.findViewById(R.id.tv_recent_word) ;
        }
    }

    // 생성자에서 데이터 리스트 객체를 전달받음.
    AdapterRecentWord(ArrayList<String> list) {
        mData = list ;
    }

    // onCreateViewHolder() - 아이템 뷰를 위한 뷰홀더 객체 생성하여 리턴.
    @Override
    public AdapterRecentWord.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext() ;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) ;

        View view = inflater.inflate(R.layout.item_recent_word, parent, false) ;
        AdapterRecentWord.ViewHolder vh = new AdapterRecentWord.ViewHolder(view) ;

        return vh ;
    }

    // onBindViewHolder() - position에 해당하는 데이터를 뷰홀더의 아이템뷰에 표시.
    @Override
    public void onBindViewHolder(AdapterRecentWord.ViewHolder holder, int position) {
        String text = mData.get(position) ;
        holder.tv_recent_word.setText(text) ;
    }

    // getItemCount() - 전체 데이터 갯수 리턴.
    @Override
    public int getItemCount() {
        return mData.size() ;
    }
}
