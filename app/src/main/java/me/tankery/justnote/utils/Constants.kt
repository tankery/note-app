package me.tankery.justnote.utils

import android.content.Context
import java.io.File

val TAG_MAP = listOf(
    "me.tankery.justnote.data.db" to "jn.db",
    "me.tankery.justnote.data.net" to "jn.net",
    "me.tankery.justnote.data" to "jn.data",
    "me.tankery.justnote.vm" to "jn.vm",
    "me.tankery.justnote.ui" to "jn.ui",
    "me.tankery.justnote.utils" to "jn.utils",
    "me.tankery.justnote" to "jn.app"
)

const val PRESERVED_TAG_DELETED = "_deleted_"
const val PRESERVED_TAG_ARCHIVED = "_archived_"
const val PRESERVED_TAG_PINNED = "_pinned_"

/**
 * Database named as note.db
 */
const val NOTE_DATABASE_NAME = "note.db"
/**
 * All notes with media items are stored in private storage in SD card
 */
const val NOTE_FILESYSTEM_ROOT = "notes"
/**
 * The entrance filename of a note
 */
const val NOTE_ENTRANCE_FILE = "index.md"
/**
 * File root dir of notes, located in SD Card if exist, else internal files dir.
 */
fun getNotesRoot(ctx: Context) =
    ctx.getExternalFilesDir(NOTE_FILESYSTEM_ROOT) ?: File(ctx.filesDir, NOTE_FILESYSTEM_ROOT)

/**
 * Preserved tags are inserted to database when create
 */
const val RES_PRESERVED_TAGS = "tags.json"
/**
 * Sample notes are inserted to database when create
 */
const val RES_SAMPLE_NOTES = "notes.json"
/**
 * Note-tag joins are inserted to database when create
 */
const val RES_TAG_JOINS = "joins.json"
/**
 * Some sample notes will be copied from assets to storage when App create
 */
const val RES_SAMPLE_NOTES_DIR = "notes"
