# java-web-lembretes_mvc
<h2>Aplicação de lembrete utilizando a linguagem Java e API JSF.</h2>

<h3>Implementação</h3>

<p>Aplicação que utiliza a especificação Java Server Faces -JSF como framework MVC, através da junção da documentação, implementações, e servidor de aplicação. </p>
	
<p>A documentação JSR 372 é referente à JSF 2.3, portanto a Java Specification Requests (JSR) da Java Community Process (JCP) é relativo a release da JSF.</p>
	
<p>As implementações mais utilizadas são Mojarra(Oracle) e MyFaces(Apache).</p>
	
<p>Os servidores de aplicação podem ser o GlassFish, Tomcat, WildFLy, entre outros. </p>

<p>O JSF traz em si o conceito MVC - Model View Controller como padrão de arquitetura de software focado no reuso de código e divisão/distribuição do conceitos em 3 camadas: Model (manipulação dos dados), View (interação de usuário) e Controller (controla as ações do usuário, manipulando as requisições e respostas entre o usuário e a camada lógica(regra de negócios, lógica e funções)).</p>

<p>Será utilizado o Maven (MVN) como ferramenta de gerenciamento e automação de construção (buid) de projetos, para gerenciar dependências através da arquitetura transparente orientada a plugins, para publicar projetos em um servidor web, para automatizar procedimentos legados, entre outros.

<h3>Arquitetura da Aplicação</h3>
<p>Projeto que desenvolve uma aplicação de Lembretes com ação de CRUD em memória.</p>

<p> Serão implementadas 3 classes:</p>
<ul>
	<li>Lembrete que modela a entidade;</li>
	<li>LembreteMapper que persiste os dados em memória;</li>
	<li>LembreteBean que vai agir como controller, recebendo as requisições da View e solicitando ao Mapper informações do sistema.</li>
</ul>

<p> Serão implementadas 4 views:</p>
<ul>
	<li>index.xhtml</li>
	<li>adicionar.xhtml</li>
	<li>editar.xhtml</li>
	<li>remover.xhtml</li>
</ul>

<p> Será implementado o arquivo properties:</p>
<ul>
	<li>Messages.properties para customizar as mensagens (suporte de internacionalização).</li>
</ul>

<p> Será implementado o arquivo de configuração JSF:</p>
<ul>
	<li>faces-config.xml para implementar as regas de navegação.</li>
</ul>
