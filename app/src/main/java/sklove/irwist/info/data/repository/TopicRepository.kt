package sklove.irwist.info.data.repository

import sklove.irwist.info.data.model.Answer
import sklove.irwist.info.data.model.Question
import sklove.irwist.info.data.model.Topic

class TopicRepository {
    private val topics = listOf<Topic>(

    )

    fun getTopics(): List<Topic> = topics
}
