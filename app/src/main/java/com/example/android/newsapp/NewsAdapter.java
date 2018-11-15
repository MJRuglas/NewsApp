package com.example.android.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, ArrayList<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_list_item, parent, false);
        }

        News news = getItem(position);

        TextView webTitle = convertView.findViewById(R.id.title_text_view);
        TextView webPublicationDate = convertView.findViewById(R.id.date_text_view);
        TextView sectionName = convertView.findViewById(R.id.section_text_view);
        TextView webUrl = convertView.findViewById(R.id.webUrl_text_view);
        TextView authorTextView = convertView.findViewById(R.id.author_text_view);
        webTitle.setText(news.getWebTitle());
        webPublicationDate.setText(news.getWebPublicationDate());
        sectionName.setText(news.getSectionName());
        webUrl.setText(news.getWebUrl());
        if (news.getAuthor() == null) {
            authorTextView.setVisibility(View.GONE);
        } else {
            authorTextView.setText(String.format("by %s", news.getAuthor()));
        }
        return convertView;
    }

    public void setItems(List<News> news) {
        this.clear();
        this.addAll(news);
        notifyDataSetChanged();

    }
}
