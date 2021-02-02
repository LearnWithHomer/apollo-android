package com.homer.apollographql.apollo.gradle.internal

import java.io.File

fun File.child(vararg path: String) = File(this, path.toList().joinToString(File.separator))
