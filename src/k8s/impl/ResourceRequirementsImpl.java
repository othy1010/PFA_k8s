/**
 */
package k8s.impl;

import k8s.K8sPackage;
import k8s.Mymap;
import k8s.ResourceRequirements;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Requirements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link k8s.impl.ResourceRequirementsImpl#getLimits <em>Limits</em>}</li>
 *   <li>{@link k8s.impl.ResourceRequirementsImpl#getRequests <em>Requests</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceRequirementsImpl extends MinimalEObjectImpl.Container implements ResourceRequirements {
	/**
	 * The cached value of the '{@link #getLimits() <em>Limits</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimits()
	 * @generated
	 * @ordered
	 */
	protected Mymap limits;

	/**
	 * The cached value of the '{@link #getRequests() <em>Requests</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequests()
	 * @generated
	 * @ordered
	 */
	protected Mymap requests;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceRequirementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return K8sPackage.Literals.RESOURCE_REQUIREMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mymap getLimits() {
		return limits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLimits(Mymap newLimits, NotificationChain msgs) {
		Mymap oldLimits = limits;
		limits = newLimits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, K8sPackage.RESOURCE_REQUIREMENTS__LIMITS, oldLimits, newLimits);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimits(Mymap newLimits) {
		if (newLimits != limits) {
			NotificationChain msgs = null;
			if (limits != null)
				msgs = ((InternalEObject)limits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - K8sPackage.RESOURCE_REQUIREMENTS__LIMITS, null, msgs);
			if (newLimits != null)
				msgs = ((InternalEObject)newLimits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - K8sPackage.RESOURCE_REQUIREMENTS__LIMITS, null, msgs);
			msgs = basicSetLimits(newLimits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.RESOURCE_REQUIREMENTS__LIMITS, newLimits, newLimits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mymap getRequests() {
		return requests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequests(Mymap newRequests, NotificationChain msgs) {
		Mymap oldRequests = requests;
		requests = newRequests;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, K8sPackage.RESOURCE_REQUIREMENTS__REQUESTS, oldRequests, newRequests);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequests(Mymap newRequests) {
		if (newRequests != requests) {
			NotificationChain msgs = null;
			if (requests != null)
				msgs = ((InternalEObject)requests).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - K8sPackage.RESOURCE_REQUIREMENTS__REQUESTS, null, msgs);
			if (newRequests != null)
				msgs = ((InternalEObject)newRequests).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - K8sPackage.RESOURCE_REQUIREMENTS__REQUESTS, null, msgs);
			msgs = basicSetRequests(newRequests, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.RESOURCE_REQUIREMENTS__REQUESTS, newRequests, newRequests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case K8sPackage.RESOURCE_REQUIREMENTS__LIMITS:
				return basicSetLimits(null, msgs);
			case K8sPackage.RESOURCE_REQUIREMENTS__REQUESTS:
				return basicSetRequests(null, msgs);
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
			case K8sPackage.RESOURCE_REQUIREMENTS__LIMITS:
				return getLimits();
			case K8sPackage.RESOURCE_REQUIREMENTS__REQUESTS:
				return getRequests();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case K8sPackage.RESOURCE_REQUIREMENTS__LIMITS:
				setLimits((Mymap)newValue);
				return;
			case K8sPackage.RESOURCE_REQUIREMENTS__REQUESTS:
				setRequests((Mymap)newValue);
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
			case K8sPackage.RESOURCE_REQUIREMENTS__LIMITS:
				setLimits((Mymap)null);
				return;
			case K8sPackage.RESOURCE_REQUIREMENTS__REQUESTS:
				setRequests((Mymap)null);
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
			case K8sPackage.RESOURCE_REQUIREMENTS__LIMITS:
				return limits != null;
			case K8sPackage.RESOURCE_REQUIREMENTS__REQUESTS:
				return requests != null;
		}
		return super.eIsSet(featureID);
	}

} //ResourceRequirementsImpl
