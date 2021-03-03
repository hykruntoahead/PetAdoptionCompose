/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.data

// Models
data class Adoption(
    val title: String,
    val author: String,
    val desc: String,
    val pictureUrl: String? = null,
    val location: String? = null,
    val detailNumber: Int
)

data class AdoptionDetail(
    val detailIntro: String,
    val photos: MutableList<String>
)

// Methods
fun getAdoptionList() = listOf(
    Adoption(
        "雪纳瑞找主人，领养-杭州宠物领养",
        "笑gugu",
        "2月26日在朝晖九区捡到一只雪纳瑞，寻找主人。找不到主人，家里狗子太多，将寻找新主人领养。",
        "https://img9.doubanio.com/view/group_topic/l/public/p407609935.jpg",
        "杭州/杭州",
        0
    ),

    Adoption(
        "小黄-北京宠物领养",
        "段涛",
        "小黄是2020年正月初五偶遇的，到现在为止一直生活在小区的地下室里，吃百家饭。金大爷给小黄做了窝，说只是一只很仁义的狗。原主任是小区的租户，后来走了就遗弃它了，小黄很亲人还会去家里串门但是从来不在邻居家过夜，她好像在等她的主人。今年圣诞她生了一窝小宝宝，我们怕她再受孕就帮她在“爱侣同行”动物做了绝育，打了疫苗和驱虫。现在小黄已经康复了，她还很小希望能有一个家庭愿意领养它，不离不弃。",
        "https://img.chonganjia.cn/diary/adopt/202103/01/202103011532187277.jpg",
        "北京/海淀区",
        1
    ),

    Adoption(
        "汇汇-上海宠物领养",
        "Leehyang",
        "2个月大的可爱小奶狗 一窝3母一公 期待爱心领养",
        "https://img.chonganjia.cn/diary/adopt/202103/01/202103011517024595.jpg",
        "上海/浦东新区",
        2
    ),

    Adoption(
        "【龙岗柯基有偿】-深圳宠物领养",
        "大圣不姓孙",
        "家里柯基生了宝宝，还有3只待领养。希望未来主人有一定经济实力，不喂毒狗粮，有条件养狗，不接受合租养狗。",
        "https://img1.doubanio.com/view/group_topic/l/public/p407596578.jpg",
        " 深圳/深圳",
        3
    ),

    Adoption(
        "品品-上海宠物领养",
        "Leehyang",
        "一个月的小奶狗寻找爱心领养",
        "https://img.chonganjia.cn/diary/adopt/202102/22/202102221646552439.png",
        " 上海/浦东新区",
        4
    )
)

fun getAdoptionDetails() = listOf(
    AdoptionDetail(
        "2月26日在朝晖九区捡到一只雪纳瑞，寻找主人。找不到主人，家里狗子太多，将寻找新主人领养。",
        listOf(
            "https://img3.doubanio.com/view/group_topic/l/public/p407613371.jpg"
        ) as MutableList<String>
    ),

    AdoptionDetail(
        "小黄是2020年正月初五偶遇的，到现在为止一直生活在小区的地下室里，吃百家饭。金大爷给小黄做了窝，说只是一只很仁义的狗。原主任是小区的租户，后来走了就遗弃它了，小黄很亲人还会去家里串门但是从来不在邻居家过夜，她好像在等她的主人。今年圣诞她生了一窝小宝宝，我们怕她再受孕就帮她在“爱侣同行”动物做了绝育，打了疫苗和驱虫。现在小黄已经康复了，她还很小希望能有一个家庭愿意领养它，不离不弃。",
        listOf(
            "https://img.chonganjia.cn/diary/adopt/202103/01/202103011532187277.jpg",
            "https://img.chonganjia.cn/diary/adopt/202103/01/202103011532188244.jpg",
            "https://img.chonganjia.cn/diary/adopt/202103/01/202103011532182072.jpg",
            "https://img.chonganjia.cn/diary/adopt/202103/01/202103011532181965.jpg"
        ) as MutableList<String>
    ),

    AdoptionDetail(
        "2个月大的可爱小奶狗 一窝3母一公 期待爱心领养",
        listOf(
            "https://img.chonganjia.cn/diary/adopt/202103/01/202103011517024595.jpg",
            "https://img.chonganjia.cn/diary/adopt/202102/20/202102201010313655.png",
            "https://img.chonganjia.cn/diary/adopt/202102/18/202102181128005492.jpg",
            "https://img.chonganjia.cn/diary/adopt/202102/18/202102181128009698.jpg"
        ) as MutableList<String>
    ),

    AdoptionDetail(
        "家里柯基生了宝宝，还有3只待领养。希望未来主人有一定经济实力，不喂毒狗粮，有条件养狗，不接受合租养狗。打完第一针即可领走。\\n\" +\n" +
            "            \"狗狗2021年1月24日出生，一共7只，妈妈是双色，爸爸是三色。目前还有一只双色，两只三色没有主人。领养价格可谈，2000-4000不等。\\n\" +\n" +
            "            \"有意者可豆油或微信。",
        listOf(
            "https://img1.doubanio.com/view/group_topic/l/public/p407596578.jpg",
            "https://img9.doubanio.com/view/group_topic/l/public/p407596626.jpg",
            "https://img2.doubanio.com/view/group_topic/l/public/p407596492.jpg",
            "https://img3.doubanio.com/view/group_topic/l/public/p407596560.jpg",
            "https://img2.doubanio.com/view/group_topic/l/public/p407596662.jpg",
            "https://img2.doubanio.com/view/group_topic/l/public/p407596443.jpg"
        ) as MutableList<String>
    ),

    AdoptionDetail(
        "一个月的小奶狗寻找爱心领养。",
        listOf(
            "https://img.chonganjia.cn/diary/adopt/202102/22/202102221646552439.png",
            "https://img.chonganjia.cn/diary/adopt/202102/20/202102201242274461.png",
            "https://img.chonganjia.cn/diary/adopt/202102/20/202102201242365762.png",
            "https://img.chonganjia.cn/diary/adopt/202102/22/202102221646295230.jpg",
            "https://img.chonganjia.cn/diary/adopt/202102/22/202102221646299415.jpg"
        ) as MutableList<String>
    )
)
