/**
 */
package k8s.impl;

import java.util.Collection;

import k8s.K8sPackage;
import k8s.LabelSelector;
import k8s.MatchExpressions;
import k8s.Mymap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link k8s.impl.LabelSelectorImpl#getMatchExpressions <em>Match Expressions</em>}</li>
 *   <li>{@link k8s.impl.LabelSelectorImpl#getMatchLabels <em>Match Labels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabelSelectorImpl extends MinimalEObjectImpl.Container implements LabelSelector {
	/**
	 * The cached value of the '{@link #getMatchExpressions() <em>Match Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<MatchExpressions> matchExpressions;

	/**
	 * The cached value of the '{@link #getMatchLabels() <em>Match Labels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchLabels()
	 * @generated
	 * @ordered
	 */
	protected Mymap matchLabels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelSelectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return K8sPackage.Literals.LABEL_SELECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MatchExpressions> getMatchExpressions() {
		if (matchExpressions == null) {
			matchExpressions = new EObjectContainmentEList<MatchExpressions>(MatchExpressions.class, this, K8sPackage.LABEL_SELECTOR__MATCH_EXPRESSIONS);
		}
		return matchExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mymap getMatchLabels() {
		return matchLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMatchLabels(Mymap newMatchLabels, NotificationChain msgs) {
		Mymap oldMatchLabels = matchLabels;
		matchLabels = newMatchLabels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, K8sPackage.LABEL_SELECTOR__MATCH_LABELS, oldMatchLabels, newMatchLabels);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatchLabels(Mymap newMatchLabels) {
		if (newMatchLabels != matchLabels) {
			NotificationChain msgs = null;
			if (matchLabels != null)
				msgs = ((InternalEObject)matchLabels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - K8sPackage.LABEL_SELECTOR__MATCH_LABELS, null, msgs);
			if (newMatchLabels != null)
				msgs = ((InternalEObject)newMatchLabels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - K8sPackage.LABEL_SELECTOR__MATCH_LABELS, null, msgs);
			msgs = basicSetMatchLabels(newMatchLabels, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.LABEL_SELECTOR__MATCH_LABELS, newMatchLabels, newMatchLabels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case K8sPackage.LABEL_SELECTOR__MATCH_EXPRESSIONS:
				return ((InternalEList<?>)getMatchExpressions()).basicRemove(otherEnd, msgs);
			case K8sPackage.LABEL_SELECTOR__MATCH_LABELS:
				return basicSetMatchLabels(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case K8sPackage.LABEL_SELECTOR__MATCH_EXPRESSIONS:
				return getMatchExpressions();
			case K8sPackage.LABEL_SELECTOR__MATCH_LABELS:
				return getMatchLabels();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case K8sPackage.LABEL_SELECTOR__MATCH_EXPRESSIONS:
				getMatchExpressions().clear();
				getMatchExpressions().addAll((Collection<? extends MatchExpressions>)newValue);
				return;
			case K8sPackage.LABEL_SELECTOR__MATCH_LABELS:
				setMatchLabels((Mymap)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case K8sPackage.LABEL_SELECTOR__MATCH_EXPRESSIONS:
				getMatchExpressions().clear();
				return;
			case K8sPackage.LABEL_SELECTOR__MATCH_LABELS:
				setMatchLabels((Mymap)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case K8sPackage.LABEL_SELECTOR__MATCH_EXPRESSIONS:
				return matchExpressions != null && !matchExpressions.isEmpty();
			case K8sPackage.LABEL_SELECTOR__MATCH_LABELS:
				return matchLabels != null;
		}
		return super.eIsSet(featureID);
	}

} //LabelSelectorImpl
