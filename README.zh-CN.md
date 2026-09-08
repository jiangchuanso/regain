🌍 **中文** · [English](README.md) · [Deutsch](README_de.md)

---

# regain <span style="font-size: 50%">your hidden information</span>
==================================================================

regain 是一个运行在桌面或服务器上的搜索引擎，支持多种文件格式。


什么是 regain？
---------------

<img src="doc/regain_screenshot.jpg" alt="regain screenshot" style="width: 400px; margin-left: 30px; float: right">

regain 是一个类似于 Google 等网络搜索引擎的搜索工具，不同之处在于它不是搜索互联网，而是搜索您自己的文件和文档。使用 regain，您可以在瞬间搜索大量数据（数 GB！）！

这通过使用搜索索引实现。regain 会爬取您的文件或网页，提取所有文本并将其放入智能搜索索引中。所有这些都在后台进行。因此，当您想要搜索某些内容时，可以立即获得结果。

regain 有两个版本：桌面搜索和服务器搜索。桌面搜索适用于普通桌面计算机，为您提供对文档或内部网网页的快速搜索。服务器搜索可以安装在 Web 服务器上，为网站或内部网文件服务器提供搜索功能。

regain 用 Java 编写，因此可在所有 Java 兼容平台上运行（包括 Windows、Linux、Mac OS、Solaris 等）。服务器搜索使用 Java Server Pages (JSP) 和标签库，桌面搜索附带自己的小型 Web 服务器。

regain 在开源许可证 [LGPL](LICENSE.md)（GNU 较宽松公共许可证）下发布。也就是说，regain 可以免费使用，没有时间限制。


功能特性
--------

regain 提供了许多非常有用的功能，这些功能对于高效的搜索引擎非常重要。

您可以在 [regain 帮助文档](http://regain.murfman.de/features) 中找到有关特定功能的详细信息。


下载
--------

regain 有两种版本：服务器搜索和桌面搜索。桌面搜索适用于那些想在工作站上使用 regain 或想尝试 regain 的用户。服务器搜索适用于希望在其网站或内部网站点中集成搜索功能的 Web 服务器管理员。

有关两个版本差异的更多详细信息，可以在 [regain 版本比较](http://regain.murfman.de/en:project_info:variant_comparison) 中找到。

如果您不确定哪个下载最适合您，请选择第一个（Windows 桌面搜索）。

下载 [Regain Desktop Search 2.1.0 for Windows (Installer)](https://github.com/til-schneider/regain/releases/download/2.1.0/regain_v2.1.0_desktop_win.exe)

下载 [Regain Desktop Search 2.1.0 for Windows (ZIP file)](https://github.com/til-schneider/regain/releases/download/2.1.0/regain_v2.1.0_desktop_win.zip)

下载 [Regain Desktop Search 2.1.0 for Linux (ZIP file)](https://github.com/til-schneider/regain/releases/download/2.1.0/regain_v2.1.0_desktop_linux.zip)

下载 [Regain Server Search 2.1.0 for all platforms (ZIP file)](https://github.com/til-schneider/regain/releases/download/2.1.0/regain_v2.1.0_server.zip)


文档
-------------

### regain 帮助文档

regain 帮助文档包含有关 regain 的安装、配置和使用信息。

[**前往 regain 帮助文档**](http://regain.murfman.de/start)


### Javadoc 和标签库文档

Java 类和标签库的文档。对于那些想要开发 regain 的人来说很有趣。

下载 [Javadoc documentation for regain 2.1.0](https://github.com/til-schneider/regain/releases/download/2.1.0/regain_v2.1.0_doc.zip)

您也可以在线阅读文档：[Javadoc documentation for regain 2.1.0](http://regain.sourceforge.net/doc/v2.1.0-STABLE/javadoc/index.html) 和 [Tag library documentation for regain 2.1.0](http://regain.sourceforge.net/doc/v2.1.0-STABLE/tlddoc/index.html)。


### regain 1.1 用户手册

在版本 1.1 之前，regain 有一本用户手册。到目前为止，并非所有内容都已从旧手册转移到新的 regain 帮助文档中。

您可以在此下载旧手册：[Download Anwenderhandbuch_Regain.pdf (in German language)](http://regain.sourceforge.net/download/Anwenderhandbuch_Regain.pdf)


### Lucene 研讨会论文

在卡尔斯鲁厄应用技术大学学习期间，我写了一篇关于 Lucene 的研讨会论文。该论文仅略微提及 regain，但展示了 [Jakarta Lucene](http://jakarta.apache.org/lucene) 的内部细节，regain 正是基于此构建的。

对于那些想了解搜索引擎背景的人来说，这篇论文很有趣。

下载：[Seminararbeit_Lucene_Ausarbeitung.pdf (in German language)](http://regain.sourceforge.net/download/Seminararbeit_Lucene_Ausarbeitung.pdf)

下载：[Seminararbeit_Lucene_Vortrag.pdf (in German language)](http://regain.sourceforge.net/download/Seminararbeit_Lucene_Vortrag.pdf)
