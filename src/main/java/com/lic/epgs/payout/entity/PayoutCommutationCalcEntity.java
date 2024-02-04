package com.lic.epgs.payout.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "PAYOUT_COMMUTATION")
public class PayoutCommutationCalcEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PAYOUT_COMM_SEQ")
	@SequenceGenerator(name = "PAYOUT_COMM_SEQ", sequenceName = "PAYOUT_COMM_SEQ", allocationSize = 1)
	@Column(name = "COMMUNITY_ID", length = 10)
	private Long communityId;

	@Column(name = "COMMUTATION_REQ", length = 100)
	private Boolean commutationReq;

	@Column(name = "COMMUTATION_BY", length = 20)
	private Integer commutationBy;
	
	@Column(name = "COMMUTATION_VALUE", length = 10)
	private Double commutationValue;

	@Column(name = "COMMUTATION_AMT", length = 10)
	private Double commutationAmt;

	@Column(name = "COMMUTATION_PERC", length = 10)
	private Double commutationPerc;

	@Column(name = "TDS_APPLICABLE", length = 100)
	private Boolean tdsApplicable;
	
	@Column(name = "NOMINEE_CODE", length = 50)
	private String nomineeCode;

	@Column(name = "TDS_PERC", length = 10, scale = 2)
	private Double tdsPerc;

	@Column(name = "TDS_AMT", length = 10, scale = 2)
	private Double tdsAmount;

	@Column(name = "AMT_PAYABLE_TO", length = 200)
	private String amtPayableTo;

	@Column(name = "EXIT_LOAD", length = 10, scale = 2)
	private Double exitLoad;
	
	@Column(name = "EXIT_LOAD_RATE", length = 10, scale = 2)
	private Double exitLoadRate;
	
	@Column(name = "MVA_EXIT_LOAD", length = 10, scale = 2)
	private Double mvaExitLoad;
	
	@Column(name = "MVA_EXIT_LOAD_RATE", length = 10, scale = 2)
	private Double mvaExitLoadRate;
	
	@Column(name = "PURCHASE_PRICE", length = 10, scale = 2)
	private Double purchasePrice;

	@Column(name = "CREATED_ON")
	private Date createdOn;

	@Column(name = "CREATED_BY", length = 100)
	private String createdBy;

	@Column(name = "MODIFIED_ON")
	private Date modifiedOn;

	@Column(name = "MODIFIED_BY", length = 50)
	private String modifiedBy;
	
	@Column(name = "NET_AMT", length = 10, scale = 2)
	private Double netAmount;
	
	@Column(name = "RATE", length = 50)
	private Double rate;
	
	@Column(name = "RATE_TYPE", length = 50)
	private String rateType;
	
	@Column(name = "INCENTIVE_RATE", length = 50)
	private Double incentiveRate;
	
	@Column(name = "DISINCENTIVE_RATE", length = 50)
	private Double disIncentiveRate;


	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PAYOUT_MEMBER_ID", nullable = false)
	private PayoutMbrEntity payoutMbrEntity;
	
	@Column(name = "MARKET_VALUE")
	private Double marketValue;
	
	@Column(name = "MARKET_VALUE_ADJUSTMENT")
	private Double marketValueAdjustment;

	
	@Column(name = "SHORT_RESERVE")
	private Double shortReserve;
	
	@Column(name = "SLAB", length = 50)
	private Double slab;

	@Column(name = "IS_ACTIVE")
	private Boolean isActive;
}