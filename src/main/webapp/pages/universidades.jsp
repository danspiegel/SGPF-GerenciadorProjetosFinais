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
				                
				                	<!-- ***** MENSAGEM IN�CIO ***** -->
  									<div id="mensagens" style="display:none;"></div>
  									<!-- ***** MENSAGEM FIM ***** -->
				                
				                    <div class="tab-pane active" role="tabpanel" id="step1">
				                    
				                        <div class="step1">
				                        
				                        	<h5>Dados da Universidade</h5>
				                        
					                        <div class="row">
					                            <div class="col-md-6">
					                                <label for="name" class="cols-sm-2 control-label">Raz�o Social</label>
													<input type="text" class="form-control" name="vo.razaoSocial" id="id_razaoSocialUniversidade" placeholder="Raz�o Social"/>
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
					                                <label for="username" class="cols-sm-2 control-label">Munic�pio</label>
													<input type="text" class="form-control" name="vo.endereco.cidade" id="id_municipioUniversidade" placeholder="Munic�pio"/>
					                            </div>
					                            <div class="col-md-6">
					                                <label for="username" class="cols-sm-2 control-label">UF</label>
													<select id="id_estadoUniversidade" name="vo.endereco.estado.id"></select>
					                            </div>
					                        </div>
					                        
					                        <div class="row">
					                            <div class="col-md-6">
					                                <label for="username" class="cols-sm-2 control-label">DDD</label>
													<input type="text" class="form-control" name="vo.telefone.numeroDdd" id="id_dddUniversidade" placeholder="DDD" maxlength="2"/>
					                            </div>
					                            <div class="col-md-6">
					                                <label for="username" class="cols-sm-2 control-label">Telefone</label>
					                                <input type="text" class="form-control" name="vo.telefone.telefone" id="id_telefoneUniversidade" placeholder="Telefone" />
					                            </div>
					                        </div>
					                   
				                        </div>
				                        
				                        <ul class="list-inline pull-right">
				                            <li><button type="button" class="btn btn-primary next-step">Pr�ximo</button></li>
				                        </ul>
				                        
				                    </div>
				                    
				                    <div class="tab-pane" role="tabpanel" id="step2">
				                    
				                        <div class="step2">
				                        
				                        	<h5>Dados do Respons�vel</h5>
				                        
				                            <div class="row">
					                            <div class="col-md-6">
					                                <label for="name" class="cols-sm-2 control-label">Matr�cula</label>
													<input type="text" class="form-control" name="vo.responsavel.matricula" id="id_matriculaResponsavel" placeholder="Matr�cula"/>
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
					                        
				                        </div>
				                        <ul class="list-inline pull-right">
				                            <li><button type="button" class="btn btn-default prev-step">Anterior</button></li>
				                            <li><button type="button" class="btn btn-primary next-step">Pr�ximo</button></li>
				                        </ul>
				                    </div>
				                    <div class="tab-pane" role="tabpanel" id="step3">
				                    
				                        <div class="step33">
				                        <h5><strong>Basic Details</strong></h5>
				                        <hr>
				                            <div class="row mar_ned">
				                                
				                            </div>
				                            <div class="row mar_ned">
				                                <div class="col-md-4 col-xs-3">
				                                    <p align="right"><stong>Date of birth</stong></p>
				                                </div>
				                                <div class="col-md-8 col-xs-9">
				                                    <div class="row">
				                                        <div class="col-md-4 col-xs-4 wdth">
				                                            <select name="visa_status" id="visa_status" class="dropselectsec1">
				                                                <option value="">Date</option>
				                                                <option value="2">1</option>
				                                                <option value="1">2</option>
				                                                <option value="4">3</option>
				                                                <option value="5">4</option>
				                                                <option value="6">5</option>
				                                                <option value="3">6</option>
				                                                <option value="7">7</option>
				                                                <option value="8">8</option>
				                                                <option value="9">9</option>
				                                            </select>
				                                        </div>
				                                        <div class="col-md-4 col-xs-4 wdth">
				                                            <select name="visa_status" id="visa_status" class="dropselectsec1">
				                                                <option value="">Month</option>
				                                                <option value="2">Jan</option>
				                                                <option value="1">Feb</option>
				                                                <option value="4">Mar</option>
				                                                <option value="5">Apr</option>
				                                                <option value="6">May</option>
				                                                <option value="3">June</option>
				                                                <option value="7">July</option>
				                                                <option value="8">Aug</option>
				                                                <option value="9">Sept</option>
				                                            </select>
				                                        </div>
				                                        <div class="col-md-4 col-xs-4 wdth">
				                                            <select name="visa_status" id="visa_status" class="dropselectsec1">
				                                                <option value="">Year</option>
				                                                <option value="2">1990</option>
				                                                <option value="1">1991</option>
				                                                <option value="4">1992</option>
				                                                <option value="5">1993</option>
				                                                <option value="6">1994</option>
				                                                <option value="3">1995</option>
				                                                <option value="7">1996</option>
				                                                <option value="8">1997</option>
				                                                <option value="9">1998</option>
				                                            </select>
				                                        </div>
				                                    </div>
				                                </div>
				                            </div>
				                            <div class="row mar_ned">
				                                <div class="col-md-4 col-xs-3">
				                                    <p align="right"><stong>Marital Status</stong></p>
				                                </div>
				                                <div class="col-md-8 col-xs-9">
				                                    <label class="radio-inline">
				                                      <input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2"> Single
				                                    </label>
				                                    <label class="radio-inline">
				                                      <input type="radio" name="inlineRadioOptions" id="inlineRadio3" value="option3"> Married
				                                    </label>
				                                </div>
				                            </div>
				                            <div class="row mar_ned">
				                                <div class="col-md-4 col-xs-3">
				                                    <p align="right"><stong>Highest Education</stong></p>
				                                </div>
				                                <div class="col-md-8 col-xs-9">
				                                    <select name="highest_qualification" id="highest_qualification" class="dropselectsec">
				                                        <option value=""> Select Highest Education</option>
				                                        <option value="1">Ph.D</option>
				                                        <option value="2">Masters Degree</option>
				                                        <option value="3">PG Diploma</option>
				                                        <option value="4">Bachelors Degree</option>
				                                        <option value="5">Diploma</option>
				                                        <option value="6">Intermediate / (10+2)</option>
				                                        <option value="7">Secondary</option>
				                                        <option value="8">Others</option>
				                                    </select>
				                                </div>
				                            </div>
				                            <div class="row mar_ned">
				                                <div class="col-md-4 col-xs-3">
				                                    <p align="right"><stong>Specialization</stong></p>
				                                </div>
				                                <div class="col-md-8 col-xs-9">
				                                    <input type="text" name="specialization" id="specialization" placeholder="Specialization" class="dropselectsec" autocomplete="off">
				                                </div>
				                            </div>
				                            <div class="row mar_ned">
				                                <div class="col-md-4 col-xs-3">
				                                    <p align="right"><stong>Year of Passed Out</stong></p>
				                                </div>
				                                <div class="col-md-8 col-xs-9">
				                                    <select name="year_of_passedout" id="year_of_passedout" class="birthdrop">
				                                        <option value="">Year</option>
				                                        <option value="1980">1980</option>
				                                        <option value="1981">1981</option>
				                                        <option value="1982">1982</option>
				                                        <option value="1983">1983</option>
				                                        <option value="1984">1984</option>
				                                        <option value="1985">1985</option>
				                                        <option value="1986">1986</option>
				                                        <option value="1987">1987</option>
				                                        <option value="1988">1988</option>
				                                        <option value="1989">1989</option>
				                                        <option value="1990">1990</option>
				                                        <option value="1991">1991</option>
				                                        <option value="1992">1992</option>
				                                        <option value="1993">1993</option>
				                                        <option value="1994">1994</option>
				                                        <option value="1995">1995</option>
				                                        <option value="1996">1996</option>
				                                        <option value="1997">1997</option>
				                                        <option value="1998">1998</option>
				                                        <option value="1999">1999</option>
				                                        <option value="2000">2000</option>
				                                        <option value="2001">2001</option>
				                                        <option value="2002">2002</option>
				                                        <option value="2003">2003</option>
				                                        <option value="2004">2004</option>
				                                        <option value="2005">2005</option>
				                                        <option value="2006">2006</option>
				                                        <option value="2007">2007</option>
				                                        <option value="2008">2008</option>
				                                        <option value="2009">2009</option>
				                                        <option value="2010">2010</option>
				                                        <option value="2011">2011</option>
				                                        <option value="2012">2012</option>
				                                        <option value="2013">2013</option>
				                                        <option value="2014">2014</option>
				                                        <option value="2015">2015</option>
				                                    </select>
				                                </div>
				                            </div>
				                            <div class="row mar_ned">
				                                <div class="col-md-4 col-xs-3">
				                                    <p align="right"><stong>Total Experience</stong></p>
				                                </div>
				                                <div class="col-md-8 col-xs-9">
				                                    <div class="row">
				                                        <div class="col-md-6 col-xs-6 wdth">
				                                            <select name="visa_status" id="visa_status" class="dropselectsec1">
				                                                <option value="">Month</option>
				                                                <option value="2">Jan</option>
				                                                <option value="1">Feb</option>
				                                                <option value="4">Mar</option>
				                                                <option value="5">Apr</option>
				                                                <option value="6">May</option>
				                                                <option value="3">June</option>
				                                                <option value="7">July</option>
				                                                <option value="8">Aug</option>
				                                                <option value="9">Sept</option>
				                                            </select>
				                                        </div>
				                                        <div class="col-md-6 col-xs-6 wdth">
				                                            
				                                        </div>
				                                    </div>
				                                </div>
				                            </div>
				                            <div class="row mar_ned">
				                               
				                            </div>
				                        </div>
				                        <ul class="list-inline pull-right">
				                            <li><button type="button" class="btn btn-default prev-step">Previous</button></li>
				                            <li><button type="button" class="btn btn-default next-step">Skip</button></li>
				                            <li><button type="button" class="btn btn-primary btn-info-full next-step">Save and continue</button></li>
				                        </ul>
				                    </div>
				                    <div class="tab-pane" role="tabpanel" id="complete">
				                        <div class="step44">
				                            <h5>Completed</h5>
				                            
				                          
				                        </div>
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