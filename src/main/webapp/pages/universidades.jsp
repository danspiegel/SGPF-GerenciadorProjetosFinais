<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	
		<%@ taglib prefix="s" uri="/struts-tags" %>
	
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		
		<link href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet">
		<link href="../includes/css/wizard.css" rel="stylesheet">
		<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
    	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
		<script src="../includes/js/wizard.js"></script>
		
		<title>SGPF - Cadastro de Universidades</title>
		
	</head>
	<body>
	
		<div class="container">
    		<div class="row">
    			<section>
        			<div class="wizard">
            			<div class="wizard-inner">
                			<div class="connecting-line"></div>
                				<ul class="nav nav-tabs" role="tablist">

                    				<li role="presentation" class="active">
                        				<a href="#step1" data-toggle="tab" aria-controls="step1" role="tab" title="Step 1">
                            				<span class="round-tab">
                                				<i class="glyphicon glyphicon-folder-open"></i>
                            				</span>
                        				</a>
                    				</li>

				                    <li role="presentation" class="disabled">
				                        <a href="#step2" data-toggle="tab" aria-controls="step2" role="tab" title="Step 2">
				                            <span class="round-tab">
				                                <i class="glyphicon glyphicon-pencil"></i>
				                            </span>
				                        </a>
				                    </li>
				                    
					                <li role="presentation" class="disabled">
					                	<a href="#step3" data-toggle="tab" aria-controls="step3" role="tab" title="Step 3">
					                    	<span class="round-tab">
					                        	<i class="glyphicon glyphicon-picture"></i>
					                        </span>
					                    </a>
					                </li>

				                    <li role="presentation" class="disabled">
				                        <a href="#complete" data-toggle="tab" aria-controls="complete" role="tab" title="Complete">
				                            <span class="round-tab">
				                                <i class="glyphicon glyphicon-ok"></i>
				                            </span>
				                        </a>
				                    </li>
				                    
                				</ul>
            				</div>

				            <form role="form">
				                <div class="tab-content">
				                
				                	<!-- ***** MENSAGEM INÍCIO ***** -->
  									<div id="mensagens" style="display:none;"></div>
  									<!-- ***** MENSAGEM FIM ***** -->
				                
				                    <div class="tab-pane active" role="tabpanel" id="step1">
				                    
				                        <div class="step1">
				                        
				                        	<h5>Dados da Universidade</h5>
				                        
					                        <div class="row">
					                            <div class="col-md-6">
					                                <label for="name" class="cols-sm-2 control-label">Razão Social</label>
													<input type="text" class="form-control" name="vo.razaoSocial" id="id_razaoSocialUniversidade" placeholder="Razão Social"/>
					                            </div>
					                            <div class="col-md-6">
					                                <label for="email" class="cols-sm-2 control-label">Nome Fantasia</label>
													<input type="text" class="form-control" name="vo.nomeFantasia" id="id_nomeFantasiaUniversidade" placeholder="Nome Fantasia"/>
					                            </div>
					                        </div>
					                        
					                        <div class="row">
					                            <div class="col-md-6">
					                                <label for="username" class="cols-sm-2 control-label">CNPJ</label>
													<input type="text" class="form-control" name="vo.cnpj" id="id_cnpjUniversidade" placeholder="CNPJ"/>
					                            </div>
					                            <div class="col-md-6">
					                                <label for="username" class="cols-sm-2 control-label">Logradouro</label>
													<input type="text" class="form-control" name="vo.endereco.logradouro" id="id_logradouroUniversidade" placeholder="Logradouro"/>
					                            </div>
					                        </div>
					                        
					                        <div class="row">
					                            <div class="col-md-6">
					                                <label for="username" class="cols-sm-2 control-label">CEP</label>
													<input type="text" class="form-control" name="vo.endereco.cep" id="id_cepUniversidade" placeholder="CEP"/>
					                            </div>
					                            <div class="col-md-6">
					                                <label for="username" class="cols-sm-2 control-label">Bairro</label>
													<input type="text" class="form-control" name="vo.endereco.bairro" id="id_bairroUniversidade" placeholder="Bairro"/>
					                            </div>
					                        </div>
					                        
					                        <div class="row">
					                            <div class="col-md-6">
					                                <label for="username" class="cols-sm-2 control-label">Município</label>
													<input type="text" class="form-control" name="vo.endereco.cidade" id="id_municipioUniversidade" placeholder="Município"/>
					                            </div>
					                            <div class="col-md-6">
					                                <label for="username" class="cols-sm-2 control-label">UF</label>
													<select id="id_estadoUniversidade" name="vo.endereco.estado.id"></select>
					                            </div>
					                        </div>
					                        
					                        <div class="row">
					                            <div class="col-md-6">
					                                <label for="username" class="cols-sm-2 control-label">DDD</label>
													<input type="text" class="form-control" name="vo.telefone.ddd" id="id_dddUniversidade" placeholder="DDD" maxlength="2"/>
					                            </div>
					                            <div class="col-md-6">
					                                <label for="username" class="cols-sm-2 control-label">Telefone</label>
					                                <input type="text" class="form-control" name="vo.telefone.numero" id="id_telefoneUniversidade" placeholder="Telefone" />
					                            </div>
					                        </div>
					                   
				                        </div>
				                        
				                        <ul class="list-inline pull-right">
				                            <li><button type="button" class="btn btn-primary next-step">Próximo</button></li>
				                        </ul>
				                        
				                    </div>
				                    
				                    <div class="tab-pane" role="tabpanel" id="step2">
				                    
				                        <div class="step2">
				                        
				                        	<h5>Dados do Responsável</h5>
				                        
				                            <div class="row">
					                            <div class="col-md-6">
					                                <label for="name" class="cols-sm-2 control-label">Matrícula</label>
													<input type="text" class="form-control" name="vo.responsavel.matricula" id="id_matriculaResponsavel" placeholder="Matrícula"/>
					                            </div>
					                            <div class="col-md-6">
					                                <label for="email" class="cols-sm-2 control-label">Nome</label>
													<input type="text" class="form-control" name="vo.responsavel.nome" id="id_nomeResponsavel" placeholder="Nome"/>
					                            </div>
					                        </div>
					                        
					                        <div class="row">
					                            <div class="col-md-6">
					                                <label for="name" class="cols-sm-2 control-label">Sobrenome</label>
													<input type="text" class="form-control" name="vo.responsavel.sobrenome" id="id_sobrenomeResponsavel" placeholder="Sobrenome"/>
					                            </div>
					                            <div class="col-md-6">
					                                <label for="email" class="cols-sm-2 control-label">CPF</label>
													<input type="text" class="form-control" name="vo.responsavel.cpf" id="id_cpfResponsavel" placeholder="Nome Fantasia"/>
					                            </div>
					                        </div>
					                        
					                        <div class="row">
					                            <div class="col-md-6">
					                                <label for="name" class="cols-sm-2 control-label">Email</label>
													<input type="text" class="form-control" name="vo.responsavel.email" id="id_emailResponsavel" placeholder="Sobrenome"/>
					                            </div>
					                            <div class="col-md-6">
					                                <label for="email" class="cols-sm-2 control-label">Cargo</label>
													<input type="text" class="form-control" name="vo.responsavel.cargo" id="id_cargoResponsavel" placeholder="Nome Fantasia"/>
					                            </div>
					                        </div>
					                        
					                        <div class="row">
					                            <div class="col-md-6">
					                                <label for="name" class="cols-sm-2 control-label">Logradouro</label>
													<input type="text" class="form-control" name="vo.responsavel.endereco.logradouro" id="id_logradouroResponsavel" placeholder="Logradouro"/>
					                            </div>
					                            <div class="col-md-6">
					                                <label for="email" class="cols-sm-2 control-label">CEP</label>
													<input type="text" class="form-control" name="vo.responsavel.endereco.cep" id="id_cepResponsavel" placeholder="CEP"/>
					                            </div>
					                        </div>
					                        
					                        <div class="row">
					                            <div class="col-md-6">
					                                <label for="name" class="cols-sm-2 control-label">Bairro</label>
													<input type="text" class="form-control" name="vo.responsavel.endereco.bairro" id="id_bairroResponsavel" placeholder="Bairro"/>
					                            </div>
					                            <div class="col-md-6">
					                                <label for="email" class="cols-sm-2 control-label">Município</label>
													<input type="text" class="form-control" name="vo.responsavel.endereco.municipio" id="id_municipioResponsavel" placeholder="Município"/>
					                            </div>
					                        </div>
					                        
					                        <div class="row">
					                            <div class="col-md-6">
					                                <label for="username" class="cols-sm-2 control-label">UF</label>
													<select id="id_estadoResponsavel" name="vo.responsavel.endereco.estado.id"></select>
					                            </div>
					                        </div>
					                        
					                        <div class="row">
					                            <div class="col-md-6">
					                                <label for="email" class="cols-sm-2 control-label">DDD</label>
													<input type="text" class="form-control" name="vo.responsavel.telefone.ddd" id="id_dddResponsavel" placeholder="DDD" maxlength="2"/>
					                            </div>
					                            <div class="col-md-6">
					                                <label for="email" class="cols-sm-2 control-label">Telefone</label>
													<input type="text" class="form-control" name="vo.responsavel.telefone.numero" id="id_numeroResponsavel" placeholder="Telefone"/>
					                            </div>
					                        </div>
					                        
				                        </div>
				                        
				                        <ul class="list-inline pull-right">
				                            <li><button type="button" class="btn btn-default prev-step">Anterior</button></li>
				                            <li><button type="button" class="btn btn-primary next-step">Próximo</button></li>
				                        </ul>
				                        
				                    </div>
				                 
				                    <div class="clearfix"></div>
				                </div>
				            </form>
        				</div>
    			</section>
  			</div>
		</div>
	
	</body>
</html>