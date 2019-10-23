package com.example.myapplication

import android.content.Context
import android.util.AttributeSet
import android.widget.ImageView
import android.widget.RelativeLayout
import com.bumptech.glide.Glide

class ImageDisplayView : RelativeLayout {

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)

    var imageSize = 0

    override fun onFinishInflate() {
        super.onFinishInflate()
//        println("宽度：${this.measuredWidth}  高度： ${this.measuredHeight}")
//        val maxWidth = this.measuredWidth
//        imageSize = (maxWidth - 52) / 3
//        println("图片宽度：$imageSize")
        println("onFinishInflate")
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        println("onMeasure")
    }

    fun setFirstImage(): ImageDisplayView {
        val imageView1 = ImageView(context)
        var imageView1Params = LayoutParams(150, 150)
        imageView1Params.addRule(CENTER_HORIZONTAL)
        imageView1Params.addRule(CENTER_VERTICAL)
        imageView1.layoutParams = imageView1Params
        println("Image width: ${imageView1.width}")
        this.addView(imageView1)
        Glide.with(context).load(R.drawable.girl).into(imageView1)
        println("setFirstImage")
        return this
    }
}