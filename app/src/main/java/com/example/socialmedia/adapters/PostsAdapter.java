package com.example.socialmedia.adapters;

import android.content.Context;
import android.media.Image;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.socialmedia.R;
import com.example.socialmedia.models.Post;
import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.squareup.picasso.Picasso;

import org.jetbrains.annotations.NotNull;

public class PostsAdapter extends FirestoreRecyclerAdapter<Post, PostsAdapter.ViewHolder> {

    Context contexto;


    public PostsAdapter(FirestoreRecyclerOptions<Post> options, Context contexto)
    {
        super(options);
        this.contexto = contexto;
    }

    @Override
    protected void onBindViewHolder(ViewHolder holder, int position, Post post) {
        holder.txtViewTitle.setText(post.getTitle());
        holder.txtViewDescription.setText(post.getDescription());
        if(post.getImage1() != null && !post.getImage1().isEmpty())
        {
            Picasso.with(contexto).load(post.getImage1()).into(holder.imgViewPost);
        }
    }

    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_post, parent, false);
        return new ViewHolder(view);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtViewTitle, txtViewDescription;
        ImageView imgViewPost;

        public ViewHolder(View view)
        {
            super(view);
            txtViewTitle = view.findViewById(R.id.txtNameCard);
            txtViewDescription = view.findViewById(R.id.txtDescripcionCard);
            imgViewPost = view.findViewById(R.id.imgPostCard);

        }


    }
}
