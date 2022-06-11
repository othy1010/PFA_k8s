/**
 */
package k8s.impl;

import java.util.Collection;
import java.util.Map;

import k8s.K8sPackage;
import k8s.MatchExpressions;
import k8s.Selector;

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
 * An implementation of the model object '<em><b>Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link k8s.impl.SelectorImpl#getMatchLabels <em>Match Labels</em>}</li>
 *   <li>{@link k8s.impl.SelectorImpl#getMatchExpressions <em>Match Expressions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectorImpl extends MinimalEObjectImpl.Container implements Selector {
	/**
	 * The cached value of the '{@link #getMatchLabels() <em>Match Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchLabels()
	 * @generated
	 * @ordered
	 */
	protected Map<String, String> matchLabels;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return K8sPackage.Literals.SELECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<String, String> getMatchLabels() {
		return matchLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatchLabels(Map<String, String> newMatchLabels) {
		Map<String, String> oldMatchLabels = matchLabels;
		matchLabels = newMatchLabels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.SELECTOR__MATCH_LABELS, oldMatchLabels, matchLabels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MatchExpressions> getMatchExpressions() {
		if (matchExpressions == null) {
			matchExpressions = new EObjectContainmentEList<MatchExpressions>(MatchExpressions.class, this, K8sPackage.SELECTOR__MATCH_EXPRESSIONS);
		}
		return matchExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case K8sPackage.SELECTOR__MATCH_EXPRESSIONS:
				return ((InternalEList<?>)getMatchExpressions()).basicRemove(otherEnd, msgs);
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
			case K8sPackage.SELECTOR__MATCH_LABELS:
				return getMatchLabels();
			case K8sPackage.SELECTOR__MATCH_EXPRESSIONS:
				return getMatchExpressions();
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
			case K8sPackage.SELECTOR__MATCH_LABELS:
				setMatchLabels((Map<String, String>)newValue);
				return;
			case K8sPackage.SELECTOR__MATCH_EXPRESSIONS:
				getMatchExpressions().clear();
				getMatchExpressions().addAll((Collection<? extends MatchExpressions>)newValue);
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
			case K8sPackage.SELECTOR__MATCH_LABELS:
				setMatchLabels((Map<String, String>)null);
				return;
			case K8sPackage.SELECTOR__MATCH_EXPRESSIONS:
				getMatchExpressions().clear();
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
			case K8sPackage.SELECTOR__MATCH_LABELS:
				return matchLabels != null;
			case K8sPackage.SELECTOR__MATCH_EXPRESSIONS:
				return matchExpressions != null && !matchExpressions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (matchLabels: ");
		result.append(matchLabels);
		result.append(')');
		return result.toString();
	}

} //SelectorImpl
