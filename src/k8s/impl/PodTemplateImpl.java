/**
 */
package k8s.impl;

import k8s.K8sPackage;
import k8s.Metadata;
import k8s.PodSpec;
import k8s.PodTemplate;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pod Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link k8s.impl.PodTemplateImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link k8s.impl.PodTemplateImpl#getSpec <em>Spec</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PodTemplateImpl extends MinimalEObjectImpl.Container implements PodTemplate {
	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected Metadata metadata;

	/**
	 * The cached value of the '{@link #getSpec() <em>Spec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpec()
	 * @generated
	 * @ordered
	 */
	protected PodSpec spec;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PodTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return K8sPackage.Literals.POD_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metadata getMetadata() {
		if (metadata != null && metadata.eIsProxy()) {
			InternalEObject oldMetadata = (InternalEObject)metadata;
			metadata = (Metadata)eResolveProxy(oldMetadata);
			if (metadata != oldMetadata) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, K8sPackage.POD_TEMPLATE__METADATA, oldMetadata, metadata));
			}
		}
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metadata basicGetMetadata() {
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetadata(Metadata newMetadata) {
		Metadata oldMetadata = metadata;
		metadata = newMetadata;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.POD_TEMPLATE__METADATA, oldMetadata, metadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PodSpec getSpec() {
		if (spec != null && spec.eIsProxy()) {
			InternalEObject oldSpec = (InternalEObject)spec;
			spec = (PodSpec)eResolveProxy(oldSpec);
			if (spec != oldSpec) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, K8sPackage.POD_TEMPLATE__SPEC, oldSpec, spec));
			}
		}
		return spec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PodSpec basicGetSpec() {
		return spec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpec(PodSpec newSpec) {
		PodSpec oldSpec = spec;
		spec = newSpec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.POD_TEMPLATE__SPEC, oldSpec, spec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case K8sPackage.POD_TEMPLATE__METADATA:
				if (resolve) return getMetadata();
				return basicGetMetadata();
			case K8sPackage.POD_TEMPLATE__SPEC:
				if (resolve) return getSpec();
				return basicGetSpec();
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
			case K8sPackage.POD_TEMPLATE__METADATA:
				setMetadata((Metadata)newValue);
				return;
			case K8sPackage.POD_TEMPLATE__SPEC:
				setSpec((PodSpec)newValue);
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
			case K8sPackage.POD_TEMPLATE__METADATA:
				setMetadata((Metadata)null);
				return;
			case K8sPackage.POD_TEMPLATE__SPEC:
				setSpec((PodSpec)null);
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
			case K8sPackage.POD_TEMPLATE__METADATA:
				return metadata != null;
			case K8sPackage.POD_TEMPLATE__SPEC:
				return spec != null;
		}
		return super.eIsSet(featureID);
	}

} //PodTemplateImpl
