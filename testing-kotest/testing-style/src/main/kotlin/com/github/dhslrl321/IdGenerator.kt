package com.github.dhslrl321

import java.time.Instant
import java.util.UUID

fun genStringId(): String = UUID.randomUUID().toString();

fun genLongId(): Long = Instant.now().toEpochMilli();