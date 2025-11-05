package com.example.mytimoapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mytimoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // 声明一个变量，用于持有我们的视图绑定对象
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 1. 初始化视图绑定对象，这是访问布局文件（activity_main.xml）中视图的现代化方式
        binding = ActivityMainBinding.inflate(layoutInflater)
        // 2. 将布局的根视图设置为当前Activity的内容视图
        setContentView(binding.root)

        // 3. 创建一些假的笔记数据用于测试
        val noteList = listOf(
            Note("这是我的第一条笔记，记录一下今天的学习心得。", "2025-11-05 14:00"),
            Note("完成了专注App的列表界面开发，非常有成就感！", "2025-11-05 15:30"),
            Note("下午需要复盘一下本周的时间利用效率。", "2025-11-05 16:00"),
            Note("提醒自己：保持专注，持续学习。", "2025-11-05 17:00"),
            Note("Timo的界面真好看，我的App也要向它看齐。", "2025-11-05 18:00")
        )

        // 4. 创建我们的“工头”——NoteAdapter，并把笔记数据交给它
        val adapter = NoteAdapter(noteList)

        // 5. 配置我们的RecyclerView
        binding.recyclerView.layoutManager = LinearLayoutManager(this) // 设置为线性布局管理器
        binding.recyclerView.adapter = adapter // 将“工头”设置给列表视图，命令它开始工作！
    }
}
