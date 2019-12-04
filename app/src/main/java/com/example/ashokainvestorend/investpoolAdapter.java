package com.example.ashokainvestorend;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ashokainvestorend.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class investpoolAdapter extends RecyclerView.Adapter<investpoolAdapter.MyViewHolder>{

    Context mContext;
    private ArrayList<invespoolitems> mpoolitemslist;

    public investpoolAdapter(Context mContext, ArrayList<invespoolitems> mpoolitemslist) {
        this.mContext = mContext;
        this.mpoolitemslist = mpoolitemslist;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;

        //change the views as you want by just changing the layout single applist
        v= LayoutInflater.from(mContext).inflate(R.layout.applist_item,parent,false);
        MyViewHolder vHolder=new MyViewHolder(v);

        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {


        holder.mpoolname.setText(mpoolitemslist.get(position).getPoolname());
        holder.mprofit.setText(mpoolitemslist.get(position).getProfit());
        holder.marea.setText(mpoolitemslist.get(position).getArea());
        holder.mlocation.setText(mpoolitemslist.get(position).getLocation());
        //holder set imageview for now there is default set(USE PICASSO METHOD TO LOAD IMAGES)
        //Picasso.with(this).load().into();
    }

    @Override
    public int getItemCount() {
        return mpoolitemslist.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        public CircleImageView mimageView;
        public TextView mpoolname;
        public TextView mlocation;
        public TextView marea;
        public TextView mprofit;
        //public TextView mreport;
        //public TextView mextraattribute;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mimageView=itemView.findViewById(R.id.poolimage);
            mpoolname=itemView.findViewById(R.id.pname);
            mlocation=itemView.findViewById(R.id.pooladdresstxt);
            marea=itemView.findViewById(R.id.poolarea);
            mprofit=itemView.findViewById(R.id.poolprofit);

        }
    }

}
