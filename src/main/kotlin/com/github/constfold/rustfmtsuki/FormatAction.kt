package com.github.constfold.rustfmtsuki

import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.fileTypes.FileType
import com.intellij.openapi.project.DumbAwareAction
import org.rust.lang.RsFileType


class FormatAction : DumbAwareAction() {
    override fun actionPerformed(e: AnActionEvent) {
        val ty = e.getData(CommonDataKeys.PSI_FILE)?.language ?: return
        if (ty.id == "Rust") {
            e.actionManager.getAction("Cargo.RustfmtFile").actionPerformed(e)
        } else {
            e.actionManager.getAction("ReformatCode").actionPerformed(e)
        }
    }
}

