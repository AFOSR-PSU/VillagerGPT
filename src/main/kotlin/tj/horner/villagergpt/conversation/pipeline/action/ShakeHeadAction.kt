package tj.horner.villagergpt.conversation.pipeline.action

import org.bukkit.entity.Villager
import tj.horner.villagergpt.conversation.pipeline.ConversationMessageAction

class ShakeHeadAction(private val villager: Villager) : ConversationMessageAction {
    override fun run() {
        villager.shakeHead()
    }
}