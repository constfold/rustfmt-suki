# rustfmt-suki
**CONGRATULATIONS!** This plugin is no longer required since `Intellij-Rust` added a new feature for this purpose recently. Please see [`Intellij-Rust` changelog #132](ssss) for more information.

![Build](https://github.com/constfold/rustfmt-suki/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/PLUGIN_ID.svg)](https://plugins.jetbrains.com/plugin/PLUGIN_ID)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/PLUGIN_ID.svg)](https://plugins.jetbrains.com/plugin/PLUGIN_ID)

## Intro
<!-- Plugin description -->
It's very simple plugin for intellij-based IDE. The reason I make this plugin is that `intellij-Rust` is using its custom formatter instead of `Rustfmt`, this leads to a shortcut problem: Since intellij-based IDEs don't have a project level keymap setting, when you want to use `Reformat with Cargofmt` as your default rust code formatter it's not possible to use the same shortcut for formatting other language(like C/C++), so you need to remember two different formatting shortcuts.

This plugin added a new formatting action which will automatically decide which formatter should be used i.e. `Rustfmt` in Rust code, `Reformat Code` in others. The only thing need to do is bind your favoured shortcut with it and ... just start formatting!
<!-- Plugin description end -->
