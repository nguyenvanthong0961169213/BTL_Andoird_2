package com.example.btl_ordering_food_app_2.Fragment.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.example.btl_ordering_food_app_2.Fragment.tab_home.Fragment_home;
import com.example.btl_ordering_food_app_2.R;
import com.example.btl_ordering_food_app_2.Model.category_obj;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class category_adapter extends RecyclerView.Adapter<category_adapter.UserViewHolder> {


    //Attributes
    //1.Khai báo các phần tử nằm trong lớp category_adapter
    //1.Lớp ngữ cảnh contaxt là lớp cha của lớp activity
    //private Activity activity;
    //2.Nguồn dữ liệu cho Adapter
    private List<category_obj> data;
    private Fragment mContext;


    public  category_adapter(Fragment_home mContext){
        this.mContext = mContext;
    }
    public  void setData(List<category_obj> list){
        this.data = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_category,parent,false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        category_obj user = data.get(position);
        if(user == null)
        {
            return;
        }
        holder.civCategory.setImageResource(user.getImage());
        holder.txtName.setText(user.getName());
    }

    @Override
    public int getItemCount() {
        if(data != null){
            return data.size();
        }
        return 0;
    }


    //3.
    public class UserViewHolder extends RecyclerView.ViewHolder{
        private CircleImageView civCategory;
        private TextView txtName;
        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            civCategory = itemView.findViewById(R.id.civ_Img);
            txtName =  itemView.findViewById(R.id.civ_Name);

        }
    }
}
