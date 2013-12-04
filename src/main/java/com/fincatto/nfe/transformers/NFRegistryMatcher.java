package com.fincatto.nfe.transformers;

import java.math.BigDecimal;

import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.simpleframework.xml.transform.RegistryMatcher;

import com.fincatto.nfe.NFAmbiente;
import com.fincatto.nfe.NFUnidadeFederativa;
import com.fincatto.nfe.classes.NFFinalidade;
import com.fincatto.nfe.classes.NFFormaPagamento;
import com.fincatto.nfe.classes.NFOrigem;
import com.fincatto.nfe.classes.NFProdutoCompoeValorNota;
import com.fincatto.nfe.classes.NFProgramaEmissor;
import com.fincatto.nfe.classes.NFRegimeTributario;
import com.fincatto.nfe.classes.NFTipo;
import com.fincatto.nfe.classes.NFTipoEmissao;
import com.fincatto.nfe.classes.NFTipoImpressao;
import com.fincatto.nfe.classes.nota.NFNotaInfoItemImpostoICMSModalidadeBaseCalulo;
import com.fincatto.nfe.classes.nota.NFNotaInfoItemImpostoICMSModalidadeBaseCaluloSubstituicaoTributaria;
import com.fincatto.nfe.classes.nota.NFNotaInfoItemProdutoArmamentoTipo;
import com.fincatto.nfe.classes.nota.NFNotaInfoItemProdutoVeiculoCondicao;
import com.fincatto.nfe.classes.nota.NFNotaInfoItemProdutoVeiculoCondicaoChassi;
import com.fincatto.nfe.classes.nota.NFNotaInfoItemProdutoVeiculoRestricao;
import com.fincatto.nfe.classes.nota.NFNotaInfoItemProdutoVeiculoTipoOperacao;

public class NFRegistryMatcher extends RegistryMatcher {
	
	public NFRegistryMatcher() {
		super.bind(NFTipo.class, new NFTipoTransformer());
		super.bind(NFOrigem.class, new NFOrigemTransformer());
		super.bind(NFAmbiente.class, new NFAmbienteTransformer());
		super.bind(LocalDate.class, new NFLocalDateTransformer());
		super.bind(BigDecimal.class, new BigDecimalTransformer());
		super.bind(NFFinalidade.class, new NFFinalidadeTransformer());
		super.bind(NFTipoEmissao.class, new NFTipoEmissaoTransformer());
		super.bind(LocalDateTime.class, new NFLocalDateTimeTransformer());
		super.bind(NFTipoImpressao.class, new NFTipoImpressaoTransformer());
		super.bind(NFFormaPagamento.class, new NFFormaPagamentoTransformer());
		super.bind(NFProgramaEmissor.class, new NFProgramaEmissorTransformer());
		super.bind(NFRegimeTributario.class, new NFRegimeTributarioTransformer());
		super.bind(NFUnidadeFederativa.class, new NFUnidadeFederativaTransformer());
		super.bind(NFProdutoCompoeValorNota.class, new NFProdutoCompoeValorNotaTransformer());
		super.bind(NFNotaInfoItemProdutoArmamentoTipo.class, new NFNotaInfoItemProdutoArmamentoTipoTransformer());
		super.bind(NFNotaInfoItemProdutoVeiculoCondicao.class, new NFNotaInfoItemProdutoVeiculoCondicaoTransformer());
		super.bind(NFNotaInfoItemProdutoVeiculoRestricao.class, new NFNotaInfoItemProdutoVeiculoRestricaoTransformer());
		super.bind(NFNotaInfoItemProdutoVeiculoTipoOperacao.class, new NFNotaInfoItemProdutoVeiculoTipoOperacaoTransformer());
		super.bind(NFNotaInfoItemProdutoVeiculoCondicaoChassi.class, new NFNotaInfoItemProdutoVeiculoCondicaoChassiTransformer());
		super.bind(NFNotaInfoItemImpostoICMSModalidadeBaseCalulo.class, new NFNotaInfoItemImpostoICMSModalidadeBaseCaluloTransformer());
		super.bind(NFNotaInfoItemImpostoICMSModalidadeBaseCaluloSubstituicaoTributaria.class, new NFNotaInfoItemImpostoICMSModalidadeBaseCaluloSubstituicaoTributariaTransformer());
	}
}