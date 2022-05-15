class WallService {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()

    fun createComment(comment: Comment): Boolean {
        for (postForSearch in posts) {
            if (comment.postId == postForSearch.id) {
                comments +=comment
                return true
            }
        }
        throw PostNotFoundException ("Поста с таким ID нет${comment.postId}")
    }

    fun add(post: Post): Post {
        val changeId = if (posts.isNotEmpty()) posts.last().id + 1 else 1
        val postNext = post.copy(id = changeId)
        posts += postNext

        return posts.last()
    }
    fun update(post: Post): Boolean {
        for ((index, posted) in posts.withIndex()) {
            if (posted.id == post.id) {
                posts[index] = post.copy(fromId = posted.fromId, date = posted.date)
                return true
            }
        }
        return false
    }
}