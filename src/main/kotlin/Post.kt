data class Post(
    val id: Long,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean,
    val comments: Comments?,
    val copyright: Copyright,
    val likes: Likes?,
    val reposts: Reposts?,
    val viewsCount: Int?,
    val postType: PostType,
    val postSource: Any?,
    val geo: Any?,
    val singerId: Int,
    val copyHistory: Array<Post>?,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val donut: Donut,
    val postponedId: Int
)