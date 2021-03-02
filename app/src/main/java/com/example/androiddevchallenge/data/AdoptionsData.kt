package com.example.androiddevchallenge.data

// Models
data class Adoption(
    val title: String,
    val author: String,
    val desc: String,
    val pictureUrl: String? = null,
    val detailInfoLink: String? = null
)

// Methods
fun getAdoptionList() = listOf(
    Adoption(
        "雪纳瑞找主人，领养-杭州宠物领养",
        "笑gugu",
        "2月26日在朝晖九区捡到一只雪纳瑞，寻找主人。找不到主人，家里狗子太多，将寻找新主人领养。",
        "https://img9.doubanio.com/view/group_topic/l/public/p407609935.jpg",
        "http://www.lazyer.net/adopt/66891"
    ),

    Adoption(
        "小黄-北京宠物领养",
        "段涛",
        "小黄是2020年正月初五偶遇的，到现在为止一直生活在小区的地下室里，吃百家饭。金大爷给小黄做了窝，说只是一只很仁义的狗。原主任是小区的租户，后来走了就遗弃它了，小黄很亲人还会去家里串门但是从来不在邻居家过夜，她好像在等她的主人。今年圣诞她生了一窝小宝宝，我们怕她再受孕就帮她在“爱侣同行”动物做了绝育，打了疫苗和驱虫。现在小黄已经康复了，她还很小希望能有一个家庭愿意领养它，不离不弃。",
        "https://img.chonganjia.cn/diary/adopt/202103/01/202103011532187277.jpg",
        "http://www.lazyer.net/adopt/66883"
    ),

    Adoption(
        "汇汇-上海宠物领养",
        "Leehyang",
        "2个月大的可爱小奶狗 一窝3母一公 期待爱心领养",
        "https://img.chonganjia.cn/diary/adopt/202103/01/202103011517024595.jpg",
        "http://www.lazyer.net/adopt/66884"
    ),

    Adoption(
        "【龙岗柯基有偿】-深圳宠物领养",
        "大圣不姓孙",
        "家里柯基生了宝宝，还有3只待领养。希望未来主人有一定经济实力，不喂毒狗粮，有条件养狗，不接受合租养狗。",
        "https://img1.doubanio.com/view/group_topic/l/public/p407596578.jpg",
        "http://www.lazyer.net/adopt/66882"
    ),

    Adoption(
        "品品-上海宠物领养",
        "Leehyang",
        "一个月的小奶狗寻找爱心领养",
        "https://img.chonganjia.cn/diary/adopt/202102/22/202102221646552439.png",
        "http://www.lazyer.net/adopt/66879"
    ),

    Adoption(
        "雪纳瑞找主人，领养-杭州宠物领养",
        "笑gugu",
        "2月26日在朝晖九区捡到一只雪纳瑞，寻找主人。找不到主人，家里狗子太多，将寻找新主人领养。",
        "https://img9.doubanio.com/view/group_topic/l/public/p407609935.jpg",
        "http://www.lazyer.net/adopt/66891"
    ),

    Adoption(
        "小黄-北京宠物领养",
        "段涛",
        "小黄是2020年正月初五偶遇的，到现在为止一直生活在小区的地下室里，吃百家饭。金大爷给小黄做了窝，说只是一只很仁义的狗。原主任是小区的租户，后来走了就遗弃它了，小黄很亲人还会去家里串门但是从来不在邻居家过夜，她好像在等她的主人。今年圣诞她生了一窝小宝宝，我们怕她再受孕就帮她在“爱侣同行”动物做了绝育，打了疫苗和驱虫。现在小黄已经康复了，她还很小希望能有一个家庭愿意领养它，不离不弃。",
        "https://img.chonganjia.cn/diary/adopt/202103/01/202103011532187277.jpg",
        "http://www.lazyer.net/adopt/66883"
    ),

    Adoption(
        "汇汇-上海宠物领养",
        "Leehyang",
        "2个月大的可爱小奶狗 一窝3母一公 期待爱心领养",
        "https://img.chonganjia.cn/diary/adopt/202103/01/202103011517024595.jpg",
        "http://www.lazyer.net/adopt/66884"
    ),

    Adoption(
        "【龙岗柯基有偿】-深圳宠物领养",
        "大圣不姓孙",
        "家里柯基生了宝宝，还有3只待领养。希望未来主人有一定经济实力，不喂毒狗粮，有条件养狗，不接受合租养狗。",
        "https://img1.doubanio.com/view/group_topic/l/public/p407596578.jpg",
        "http://www.lazyer.net/adopt/66882"
    ),

    Adoption(
        "品品-上海宠物领养",
        "Leehyang",
        "一个月的小奶狗寻找爱心领养",
        "https://img.chonganjia.cn/diary/adopt/202102/22/202102221646552439.png",
        "http://www.lazyer.net/adopt/66879"
    )
)
