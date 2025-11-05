package com.example.mytimoapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NoteAdapter(private val notes: List<Note>) : RecyclerView.Adapter<NoteAdapter.NoteViewHolder>() {

    // 这个内部类，代表一个卡片视图的容器，它持有卡片上需要被填充的两个TextView
    class NoteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val contentTextView: TextView = itemView.findViewById(R.id.note_content_text)
        val timestampTextView: TextView = itemView.findViewById(R.id.note_timestamp_text)
    }

    // 当列表需要一个新的卡片“样板间”时，这个方法被调用
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        // 我们使用LayoutInflater，把 note_card_item.xml 这个布局文件“吹”成一个真实的View对象
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.note_card_item, parent, false)
        return NoteViewHolder(view)
    }

    // 当列表需要给一个卡片填充具体内容时，这个方法被调用
    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        // 从数据列表中获取当前位置的笔记
        val note = notes[position]
        // 将笔记的内容和时间戳，设置到卡片视图容器(holder)里的TextView上
        holder.contentTextView.text = note.content
        holder.timestampTextView.text = note.timestamp
    }

    // 告诉列表总共有多少个数据项需要显示
    override fun getItemCount(): Int {
        return notes.size
    }
}
