package com.theendercore.dwarven_inventions

import net.minecraft.util.Identifier
import org.slf4j.Logger
import org.slf4j.LoggerFactory

@Suppress("unused")
object DwarvenInventions {
    const val MODID = "dwarven_inventions"

    @JvmField
    val log: Logger = LoggerFactory.getLogger(DwarvenInventions::class.simpleName)

    fun init() {
        log.info("Hello from Common")
    }

    fun id(path: String): Identifier = Identifier.of(MODID, path)
}
