package com.omarea.krscript.model

class ActionParamInfo {
    // 参数名：必需保持唯一
    var name: String? = null

    var title: String? = null

    var label: String? = null

    // 描述
    var desc: String? = null

    // 值
    var value: String? = null
    var valueShell: String? = null
    var valueFromShell: String? = null
    var maxLength = -1 // input only
    var type: String? = null
    var max: Int = Int.MAX_VALUE // seekbar only
    var min: Int = Int.MIN_VALUE // seekbar only
    var required: Boolean = false // 是否是必需的
    var readonly: Boolean = false
    var options: ArrayList<ActionParamOption>? = null
    var optionsFromShell: ArrayList<HashMap<String, Any>>? = null
    var optionsSh = ""
    // 是否允许多选(options only)
    var multiple: Boolean = false
    // 是否支持
    var supported: Boolean = true
    // 文本框的水印（提示占位符）
    var placeholder: String = ""
    // 文件mime类型（仅限type=file有效）
    var mime: String = ""
    // 文件后缀（仅限type=file有效）
    var suffix: String = ""
    // 多个值的分隔符（仅限多选下拉）
    var separator: String = "\n"

    open class ActionParamOption {
        var value: String? = null
        var desc: String? = null
    }
}
