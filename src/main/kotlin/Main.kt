fun main() {

    val postOne = Post(
        id = 5,
        ownerId = 666,
        fromId = 111,
        createdBy = 5656,
        date = 12042022,
        text = "Sun shine and it is OK",
        replyOwnerId = 7890,
        replyPostId = 2346,
        friendsOnly = false,
        comments = Comments(count = 18, canPost = true, groupsCanPost = false, canClose = true, canOpen = true),
        copyright = Copyright(id = 3131, link = "www.ff.com", name = "site", type = "doc" ),
        likes = Likes(count = 25, userLike =  true, canLike = false, canPublish = true),
        reposts = Reposts(count = 3, userReposted = true),
        viewsCount = 15,
        postType = PostType.POST,
        singerId = 8965,
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = true,
        markedAsAds = false,
        isFavorite = true,
        donut = Donut(isDonut = true, paidDuration = 897, canPublishFreeCopy = false, editMode = "all"),
        postponedId = 0
    )

    val postTwo = Post(
        id = 6,
        ownerId = 666,
        fromId = 111,
        createdBy = 5656,
        date = 12042022,
        text = "Sun shine and it is OK",
        replyOwnerId = 7890,
        replyPostId = 2346,
        friendsOnly = false,
        comments = Comments(count = 18, canPost = true, groupsCanPost = false, canClose = true, canOpen = true),
        copyright = Copyright(id = 3131, link = "www.ff.com", name = "site", type = "doc" ),
        likes = Likes(count = 25, userLike =  true, canLike = false, canPublish = true),
        reposts = Reposts(count = 3, userReposted = true),
        viewsCount = 15,
        postType = PostType.POST,
        singerId = 8965,
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = true,
        markedAsAds = false,
        isFavorite = true,
        donut = Donut(isDonut = true, paidDuration = 897, canPublishFreeCopy = false, editMode = "all"),
        postponedId = 0
    )
    val postThree = Post(
        id = 8,
        ownerId = 666,
        fromId = 111,
        createdBy = 5656,
        date = 12042022,
        text = "Sun shine and it is OK",
        replyOwnerId = 7890,
        replyPostId = 2346,
        friendsOnly = false,
        comments = Comments(count = 18, canPost = true, groupsCanPost = false, canClose = true, canOpen = true),
        copyright = Copyright(id = 3131, link = "www.ff.com", name = "site", type = "doc" ),
        likes = Likes(count = 25, userLike =  true, canLike = false, canPublish = true),
        reposts = Reposts(count = 3, userReposted = true),
        viewsCount = 15,
        postType = PostType.POST,
        singerId = 8965,
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = true,
        markedAsAds = false,
        isFavorite = true,
        donut = Donut(isDonut = true, paidDuration = 897, canPublishFreeCopy = false, editMode = "all"),
        postponedId = 0
    )

    val postFour = Post(
        id = 2,
        ownerId = 999,
        fromId = 999,
        createdBy = 999,
        date = 12042022,
        text = "Sun shine and it is OK",
        replyOwnerId = 7890,
        replyPostId = 2346,
        friendsOnly = false,
        comments = Comments(count = 18, canPost = true, groupsCanPost = false, canClose = true, canOpen = true),
        copyright = Copyright(id = 3131, link = "www.ff.com", name = "site", type = "doc" ),
        likes = Likes(count = 25, userLike =  true, canLike = false, canPublish = true),
        reposts = Reposts(count = 3, userReposted = true),
        viewsCount = 15,
        postType = PostType.POST,
        singerId = 8965,
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = true,
        markedAsAds = false,
        isFavorite = true,
        donut = Donut(isDonut = true, paidDuration = 897, canPublishFreeCopy = false, editMode = "all"),
        postponedId = 0
    )

    val wall = WallService()

    val controlOne = wall.add(postOne)
    val controlTwo = wall.add(postTwo)
    val controlThree = wall.add(postThree)

    wall.update(postFour)

    println(controlOne.id)
    println(controlTwo.id)
    println(controlThree.id)
    println(postFour.id)
    println(wall.update(postFour))

}