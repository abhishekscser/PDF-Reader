package com.theandroiddev.pdfreader;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class List_View_Holder extends RecyclerView.ViewHolder implements View.OnClickListener//implementing click listner on viewholder
{
    private TextView fileName;
    private ImageView imageView;
    Recycler_Adapter.onClickItemListner onClickItemListner;
    private ImageButton moreOptnBtn;
    PopupMenu popupMenu;

    public List_View_Holder(View itemView, Recycler_Adapter.onClickItemListner onClickItemListner)
    {
        super(itemView);
        fileName = itemView.findViewById(R.id.file_name);
        imageView = itemView.findViewById(R.id.pdf_image);
        imageView.setImageResource(R.drawable.pdf_icon);
        this.onClickItemListner = onClickItemListner;
        moreOptnBtn = itemView.findViewById(R.id.moreOptnBtn);

        itemView.setOnClickListener(this);

    }

    public TextView getFileName()
    {
        return fileName;
    }


    @SuppressLint("ResourceAsColor")
    @Override
    public void onClick(View view)
    {
        onClickItemListner.onClickitem(getAdapterPosition());
    }

    public ImageButton getMoreOptnBtn()
    {
        return moreOptnBtn;
    }




}
